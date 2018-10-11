
pipeline {
  agent any
  stages {
    stage('Maven build'){
      steps {
        withMaven(
         maven: 'Maven'
        ) {
          sh 'mvn -s settings.xml clean install'
        }
      }
    }
  }
}
