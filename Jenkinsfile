
pipeline {
  agent any
  stages {
    stage('Maven build'){
      steps {
        withMaven(
         maven: 'Maven',
         mavenSettingsConfig: 'DockerDeployMaven'
        ) {
          sh 'mvn clean install'
        }
      }
    }
  }
}
