# gfc-services

## Installation

```shell
$ git clone git@forge.intra-cocktail.org:gfc/generateur-controleurs-wo.git
$ cd generateur-controleurs-wo/generateur-controleur-wo-compile
$ ../gradlew install
$ cd ../generateur-controleur-wo-runtime/
$ ../gradlew install
```

```shell
$ git clone git@forge.intra-cocktail.org:francois.lagoueyte/gfc-services.git
$ ../gradlew install
```

### IDE

#### eclipse

```
importer le projet avec buildship en conservant les options par défaut
$ ./gradlew eclipseJdtApt
$ ./gradlew eclipseFactorypath
$ ./gradlew eclipseJdt
-- redemarrer le workspace
clean workspace
dans les filtres projet, ne pas cacher les .*resources ce qui permet de voir le répertoire .apt_generated et le répertoire build où sont présents les fichiers classes Java genérés
```

#### idea

## Lancer l'application

Pour lancer l'application, il faut
- se mettre dans le répertoire application et
- lancer `../gradlew bootRun`
- ou builder l'appli et la lancer via `../gradlew build && java -jar build/libs/gfc-services-1.0.0.jar`

Le plugin springboot permet aussi de construire des livrables pouvant être utilisés comme dépendance
si on désactive le plugin pour certains sous-projets et qu'on utilise le classifier 'exec'.

Pour construire un Jar contenant toutes les classes / dépendances :
- se placer dans le répertoire application
- lancer `../gradlew shadowJar`

## Multiprojet

Le projet est un multi-projet gradle 4.0.2 composé de :
- *app-spring* : permet de booter le point d'entrée des services. Charge automatiquement tous les controllers Rest, Beans.
- *app-wo* : application au format WO
- *compta-budgetaire* : domaine comptabilite budgetaire
- *compta-generale* : domaine comptabilite budgetaire
- *depense* : domaine de la dépense
- *depense-search* : sous-domaine des recherches de la chaine de la depense
- *common* : classes communes (configuration, ...)

On peut afficher la structure du multiprojet avec la commande `./gradlew -q projects`

__Notes__ :
- on utilise toujours le wrapper gradle fourni

## Objectifs

### Explication des choix

- :question: __décomposer le périmètre fonctionel en `bounded context`__
- :exclamation: chaque bounded context est représenté par un module / répertoire (compta-budgetaire, depense, ...)
- :question: __exposer des API pour nos servcies métiers (encapsulation)__
- :exclamation: chaque module fonctionel est redecoupé en deux : API et IMPLEMENTATION.
  - l'API expose les services consommables par un autre module java
  - on utilise le plugin gradle java-library (à la place de java) pour définir des dépendances API et IMPLEMENTATION entre modules.
  - un module implementation ne peut pas avoir une dépendance vers un autre module implementation.
  - un module implementation consomme des modules API 
  - sous eclipse, les noms de projets sont correctement gérés par défaut (un suffix -api ou -implementation)
- :question: __utiliser des `domain events` pour déclencher des actions entre contextes métiers__
- :exclamation: utilisation des events Spring qui sont transactionnels
- :question: __implémenter une architecture hexagonale__
- :exclamation: dans implémentation on a 
   - un package application qui définit les services applicatifs.
   - un package metier.modele qui contient toutc e qui constitue le métier sans référence aux couches techniques (persistence, rest, ...)
   - un package port.adapter.<type> qui contient la couche technique : framework, librairie persistence, rest, services externes 
- :question: __utiliser des structures immutables__
- :exclamation: certains objets : commands et representations sont des structures immutables
   - pour la branche master : on utilise la bibliothèque immutables.github.io,
   - pour la branche kotlin : les data class 
- :question: __faciliter le mapping entre les entités et leur representation__
- :exclamation: utilisation de la librairie mapstruct pour transférer une entité JPA vers une représentation API
- :question: __pouvoir générer un client http facilement (plus facilement que nos clients jersey actuels)__
- :exclamation: définition d'une interface ServiceDescriptor qui contient une API dédié au transport hors Java (Rest par exemple)
  - on définit les routes Rest via les annotations Jax-rs qui seront héritées par l'implémentation (chapitre 3.6 de la spec))
  - on ajoute les annotations Feign (RequestLine)
  - une appli tierce peut construire un client Feign
  
__Notes__ :
- Lombok n'a pas été utilisé. Bien que pratique, et facile à mettre en place je n'apprécie pas la librairie
- immutables est plus délicat, parfois capricieux. Plus ciblé dans son fonctionnement. J'apprécie cependant l'utilisation de APT qui permet de visualiser le code généré.

### Implémentation des choix

- __consommation api par un module java__
   - :compta-generale:implementation : HelloComptableEtBudgetaireServiceImpl accède à HelloBudgetaireService
- __domain events__ : 
   - :compta-generale:implementation : HelloComptableEtBudgetaireServiceImpl publie un événement HelloComptaGeneraleSentEvent
   - :app-spring : EventLogger loggue l'événement HelloComptaGeneraleSentEvent
   - [Ressource test](http://localhost:9000/api/v1/gfc/compta-generale/hello)
- __objet immutables__
   - {branche master} :depense:api : ServiceFaitCommand contient les commandes exposées 
   - {branche kotlin} :depense:api : ServiceFaitCommand contient les commandes exposées
- __mappings__
   - :depense:implementation : ApiMappers contient les interfaces de mapping. L'utilisation a lieu dans CodeAnalytiqueResource. 
- __feign : client http__
   - :depense:implementation : CodeAnalytiqueResourceTest

### Conventions

Plusieurs conventions existent :
- module-api : les interfaces de services
- module-implementation : les adapters (JAX-RS, JPA) + les modeles métiers + la couche services applicatifs
- module-search : modules optimisés pour les recherches (QueryDsl)

## Divers

- la config de la datasource a été remaniée pour surcharger la conf springboot afin d'intégrer les mdps cryptés (non testé)
- utilisation de Kotlin-JPA-Spec pour generer des specs Spring data quisont ensuite transformer en Criteria JPA
- la tâche de génération des queryDsl est en place pour les sous-projets search seulement
- accès a spring actuator.
    - [Ressource Health](http://localhost:9001/health) : état de l'appli
    - [Ressource Info](http://localhost:9001/info) : infos git
- le starter Spring donne accès a sl4f et logback par défaut. Conf logback-spring.xml disponible dans app-spring.

### Plugins gradle

- springBoot : acces aux starters + autoconfiguration + packaging
- shadow : construire un jar qui peut-être utilisé en tant que librairie externe

Le jar spring boot, par défaut, ne peut pas être utilisé en tant que dépendance par un autre projet Java.

Le jar shadow permet cela mais en contrepartie incorpore par défaut toutes les classes de toutes les dépendances (JPA, Spring, ...).
Il y a un risque de conflits de version.

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

- quel module est propriétaire des evenements
- fusionner application dans gfc-services
- l'utilisation de java-library
- separer dans un jar la partie port.adapter
- le temps investi à essayer d'avoir une application ainsi qu'une librairie utilisable en dépendance (plugin, pb de librairies repackagées)
    + investir du temps à intégrer plusieurs applis (camel, reflexions métier pour ne pas avoir de tx)
    + mettre tout le pgi dans le meme repo excepte les IHM

