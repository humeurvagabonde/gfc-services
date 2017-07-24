# gfc-services

## Présentation

Coquille présentant la structure de code proposée.

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
- ou builder l'appli et la lancer via `../gradlew build && java -jar build/libs/gfc-serves-1.0.0.jar`

Pour construire un Jar contenant toutes les classes / dépendances :
- se placer dans le répertoire application
- lancer `../gradlew shadowJar`

### Plugins gradle

- springBoot : acces aux starters + autoconfiguration + packaging batoobotu
- springDependenciesManagement : acces au BOM Maven. Vérifier l'utilité car peut-être déjà incorporer dans springBoot
- shadow : construire un jar qui peut-être utilisé en tant que librairie externe

Le jar spring boot ne peut pas être utilisé en tant que dépendance par un autre projet Java.

Le jar shadow permet cela mais en contrepartie incorpore par défaut toutes les classes de toutes les dépendances (JPA, Spring, ...).
Il y a un risque de conflits de version.

## Réalisé

Le projet s'appuie sur :
- gradle 4.0.1 exposé via le wrapper (gradlew)
- un multiprojet gradle
- une séparation api / implementation au niveau organisation et en utilisant le plugin java-library
- un test ou une ressource Rest de 'compta-generale' consomme un service de 'compta-budgetaire' et lève un évenement affiché dans la console d'erreur : [Ressource test](http://localhost:8080/compta-generale/hello)

### Multiprojet gradle

Le build.gradle principal définit uniquement les infos pour allprojects et subprojects. J'ai fait un test en embarquant le code de `application` directement dans gfc-services.

Pour démarrer j'ai trouvé cela moins clair car cela mélange la définition globale du multiprojet et la définition de l'application principale.

## Reste à faire / étudier

- [x] mettre en place des packages selon ports et adapter
- [ ] tester un projet implementation dédiée pour les adapters
- [ ] mettre en place mapStruct
- [ ] mettre en place une regle (ImportControl) checkstyle (+ plugin gradle) qui verifie les imports
- [ ] etudier spring integration : gateway ou service activator
- [x] mettre en place immutables.github.io dans gradle
- [ ] configurer plus finement immutables et gradle (repertoire des classes generees)
- [x] creer un @ImmutableStyle : identique a Lagom pour débuter
- [ ] configurer immutables pour les Command, les ADT
- [ ] faire un projet depense-search avec querydsl et des dependances propres a tous les projets <module>-search
- [x] faire un projet shared ou common
- [ ] dans les projets API définir des interfaces Feign pour remplacer les clients jersey
- [ ] mettre en place JAX-RS a la place de Spring MVC
- [ ] mettre en place JPA
- [ ] en fonction du découpage on pourra faire de spring.factories et configuration par librairie
- [ ] creer interface correspondant aux packages plsql de depense-SF
- [ ] introduction de PCollections pour les collections immutables si besoin

## A discuter

- fusionner application dans gfc-services
- l'utilisation de java-library
- separer dans un jar la partie port.adapter
- le temps investi à essayer d'avoir une application ainsi qu'une librairie utilisable en dépendance (plugin, pb de librairies repackagées)
    + investir du temps à intégrer plusieurs applis (camel, reflexions métier pour ne pas avoir de tx)
    + mettre tout le pgi dans le meme repo excepte les IHM
