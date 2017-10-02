# gfc-services CI

## Fonctionnement de la forge

### seed

- les jobs Jenkins du repertoire NxJobs sont générés depuis un job seed (à la racine) et en exploitant le plugin Job DSL
- ce job seed va cloner le projet jenkinsjob (git@forge.intra-cocktail.org:outils/jenkinsjobs.git)
- puis appeler l'ensemble des scripts Groovy contenus dans jobs/**/*Jobs.Groovy

### job groovy

Chaque Job groovy génère un job Jenkins build ou flow ou sonar, pour cela :

- il recupère l'ensemble des projets de la forge via l'API gitlab
- seuls les projets ayant dans la description les mots-clés application,sonar,war,lib sont éligibles
- certaines branches sont blacklistées dans le fichier utils/JobsProperties.groovy du projet jenkinsjobs

### Déroulement d'un Job Jenkins

- chaque projet dans la forge doit configuré un webhook (settings/integrations) pour déclencher http://jenkins.intra-cocktail.org/gitlab/build_now sur un événement de push
- lors d'un commit, le webhook défini dans la forge déclenche l'execution du Jobs Jenkins Flow correspondant à la branche
- puis une fois le job Build terminé, le déploiement sur tempo (rundeck) est déclenché.
- le déploiement s'appuie sur des tags issus de traboule en fonction de la branche (ex: http://traboule.intra-cocktail.org/cgi-bin/WebObjects/AppValidationCenter.woa/ra/deployenvs/ci/master/)
- ces tags permettent de filtrer les noeuds de déploiement utilisé par Tempo.

_Notes_

- les tags sont mis à jour par les AMOE

### Papa, comment on teste le déploiement ?

Une fois le Job Flow terminé, on peut tester le déploiement en allant sur l'URL : http://pgidev.intra-cocktail.org/noWO/gfc-services/api/v1/gfc/compta-generale/hello

Si cela ne fonctionne pas :
- il faut redemarrer le tomcat: ssh tomcat@pgidev ou ssh tomcat@pgidev.in.asso-cocktail.org
- ./bin/catalina.sh stop
- ./bin/catalina.sh start




