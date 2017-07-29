# gfc-services

### Multiprojet

Le projet est un multi-projet composé de :
- *app-spring* : permet de booter le point d'entrée des services. Charge automatiquement tous les controllers Rest, Beans.
- *app-wo* : application au format WO
- *compta-budgetaire* : domaine comptabilite budgetaire
- *compta-generale* : domaine comptabilite budgetaire
- *depense* : domaine de la dépense
- *depense-search* : sous-domaine des recherches de la chaine de la depense
- *common* : classes communes (configuration, ...)

On peut afficher la structure du multiprojet avec la commande 'gradle -q projects'

### Conventions

Plusieurs conventions existent :
- module-api : les interfaces de services
- module-implementation : les adapters (JAX-RS, JPA) + les modeles métiers (applicationService, entites
- module-search : modules optimisés pour les recherches (QueryDsl)

### Execution

Pour lancer l'application, il faut
- se mettre dans le répertoire application et
- lancer `../gradlew bootRun`
- ou builder l'appli et la lancer via `../gradlew build && java -jar build/libs/gfc-services-1.0.0.jar`

Le plugin springboot permet aussi de construire des livrables pouvant être utilisés comme dépendance
si on désactive le plugin pour certains sous-projets et qu'on utilise le classifier 'exec'.

Pour construire un Jar contenant toutes les classes / dépendances :
- se placer dans le répertoire application
- lancer `../gradlew shadowJar`

### Plugins gradle

- springBoot : acces aux starters + autoconfiguration + packaging
- shadow : construire un jar qui peut-être utilisé en tant que librairie externe

Le jar spring boot, par défaut, ne peut pas être utilisé en tant que dépendance par un autre projet Java.

Le jar shadow permet cela mais en contrepartie incorpore par défaut toutes les classes de toutes les dépendances (JPA, Spring, ...).
Il y a un risque de conflits de version.

## Détails du Réalisé

Le projet s'appuie sur :

- gradle 4.0.1 exposé via le wrapper (gradlew)
- un multiprojet gradle 
- une séparation api / implementation au niveau organisation et en utilisant le plugin java-library
    - qui génére des noms de projet IDE corrects
- une interface Descriptor dans l'API
    - qui définit les routes REST via les annotations JAX-RS qui seront héritées par l'implémentation (chapitre 3.6 de la spec))
    - qui est utilisé pour générer un client http avec Feign (exemple dans :depense:implementation - test)
- Mise en place de structure immutable pour les commands (ex dans :depense:api et : implementation)
    - via immutables pour la branche master. Limitation de immutable pour les entites JPA
    - via kotlin pour la branche kotlin. Kotlin fonctionne aussi pour JPA.
- utilisation de mapstruct pour transférer une entité JPA vers une représentation API (package mappers de :depense:implementation)
- la config de la datasource a été remaniée pour surcharger la conf springboot afin d'intégrer les mdps cryptés (non testé)
- utilisation de Kotlin-JPA-Spec pour generer des specs Spring data quisont ensuite transformer en Criteria JPA
- la tâche de génération des queryDsl est en place pour les sous-projets search seulement
- un test Rest où une ressource de 'compta-generale' consomme un service de 'compta-budgetaire' et lève un évenement affiché dans la console d'erreur : [Ressource test](http://localhost:9000/api/v1/gfc/compta-generale/hello)
- accès a spring actuator.
    - [Ressource Health](http://localhost:9001/health) : état de l'appli
    - [Ressource Info](http://localhost:9001/info) : infos git
- le starter Spring donne accès a sl4f et logback par défaut. Conf logback-spring.xml disponible dans app-spring.

__Notes__ :
- Lombok n'a pas été utilisé. Bien que pratique, et facile à mettre en place je n'apprécie pas la librairie
- immutables est plus délicat, parfois capricieux. Plus ciblé dans son fonctionnement. J'apprécie cependant l'utilisation de APT qui permet de visualiser le code généré.

### Kotlin 

Pour la branche Kotlin :
- utiliser intellij idea
- installer le plugin eclipse-kotlin depuis le marketplace

On utilise les features de Kotlin suivantes :
- les data class
- la librairie jpa-spec

Pour idea, il faut aussi configurer APT.

### Multiprojet gradle

Le build.gradle principal définit uniquement les infos pour allprojects et subprojects. J'ai fait un test en embarquant le code de `application` directement dans gfc-services.

Pour démarrer j'ai trouvé cela moins clair car cela mélange la définition globale du multiprojet et la définition de l'application principale.

## Reste à faire / étudier


- [ ] tester un projet implementation dédiée pour les adapters
- [ ] dans implementation, définir les mappers avec mapstruct. Dep gradle deja en place.
- [ ] mettre en place une regle de type ImportControl checkstyle qui verifie les imports
- [ ] etudier spring integration : gateway ou service activator
- [ ] configurer plus finement immutables et gradle ; repertoire des classes generees
- [ ] configurer immutables pour les Command, representations
- [ ] faire un projet depense-search avec querydsl et des dependances propres a tous les projets <module>search
- [ ] dans les projets API définir des interfaces Feign pour remplacer les clients jersey
- [ ] mettre en place JPA
- [ ] mettre en place QueryDsl
- [ ] en fonction du découpage on pourra faire de spring.factories et configuration par librairie
- [ ] creer interface correspondant aux packages plsql de depense-SF
- [ ] introduction de PCollections pour les collections immutables si besoin
- [x] mettre en place des packages selon ports et adapter
- [x] mettre en place immutables.github.io dans gradle
- [x] creer un @ImmutableStyle : identique a Lagom pour débuter
- [x] mettre en place JAX-RS a la place de Spring MVC
- [x] mettre en place Spring jdbc + tx
- [x] faire un projet shared ou common


## A discuter

- fusionner application dans gfc-services
- l'utilisation de java-library
- separer dans un jar la partie port.adapter
- le temps investi à essayer d'avoir une application ainsi qu'une librairie utilisable en dépendance (plugin, pb de librairies repackagées)
    + investir du temps à intégrer plusieurs applis (camel, reflexions métier pour ne pas avoir de tx)
    + mettre tout le pgi dans le meme repo excepte les IHM
