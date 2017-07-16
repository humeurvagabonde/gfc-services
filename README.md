# gfc-services

Coquille présentant la structure de code proposée.

Le projet est un multi-projet composé de :
- *application* : permet de booter le point d'entrée des servcies. Charge automatiquement tous les controllers Rest, Beans au sein.
- *compta-budgetaire* : projet contenant l'API et l'Implementation du domaine comptabilite budgetaire
- *compta-generale* : projet contenant l'API et l'Implementation du domaine comptabilite budgetaire

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
- un test ou une ressource Rest de 'compta-generale' consomme un service de 'compta-budgetaire' et lève un évenement affiché dans la console d'erreur : [http://localhost:8080/compta-generale/hello]

### Multiprojet gradle

Le build.gradle principal définit uniquement les infos pour allprojects et subprojects. J'ai fait un test en embarquant le code de 'application' directement dans gfc-services.

Pour démarrer j'ai trouvé cela moins clair car cela mélange la définition globale du multiprojet et la définition de l'application principale.


## Reste à faire

- mettre en place des packages selon ports et adapter
- mettre en place immutables.github.io pour les Command, les ADT
- faire un projet depense-recherche avec querydsl et des dependances propres a tous les projets *-recherche
- faire un projet shared ou common

## A discuter

- fusionner application dans gfc-services
- l'utilisation de java-library


