# gfc-services

Coquille présentant la structure de code proposée.

Le projet est un multi-projet composé de :
- *application* : permet de booter le point d'entrée des servcies. Charge automatiquement tous les controllers Rest, Beans.
- *compta-budgetaire* : projet contenant l'API et l'Implementation du domaine comptabilite budgetaire
- *compta-generale* : projet contenant l'API et l'Implementation du domaine comptabilite budgetaire

Plusieurs conventions existent :
- <module>-api : toutes les API
- <module>-implementation : toutes les implementations (JAX-RS, JPA)
- <module>-search : tous les modules dédiés à la recherche (QueryDsl)


Pour lancer l'application, il faut
- se mettre dans le répertoire application et 
- lancer ../gradlew bootRun
- ou builder l'appli et la lancer via `../gradlew build && java -jar build/libs/gfc-serves-1.0.0.jar` 

On peut afficher la structure du multiprojet avec la commande 'gradle -q projects'

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

- [ ] mettre en place des packages selon ports et adapter (en deux versions : l'une complete et l'autre allegée par exemple pour depense-sf-plsql qui nécessite trop d'indirection)
- [X] mettre en place immutables.github.io dans gradle
- [ ] configurer plus finement immutables et gradle (repertoire des classes generees)
- [ ] configurer immutables pour les Command, les ADT (creer un @ImmutableStyle etc)
- [ ] faire un projet depense-search avec querydsl et des dependances propres a tous les projets *-search
- [X] faire un projet shared ou common
- [ ] dans les projets API définir des interfaces Feign pour générer automatiquement les clients Http (a la palce des clients jersey)
- [ ] mettre en place JAX-RS a la place de Spring MVC
- [ ] mettre en place JPA 
- [ ] en fonction du découpage on pourra faire de spring.factories et configuration par librairie
- [ ] creer interface correspondant aux packages plsql de depense-SF
- [ ] introduction de PCOllections pour les collections immutables si besoin

## A discuter

- fusionner application dans gfc-services
- l'utilisation de java-library

