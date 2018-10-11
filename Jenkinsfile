
pipeline {
  agent any
  stages {
    stage('Maven build'){
      steps {
        withMaven(
         maven: 'Maven'
        ) {
          sh 'mvn clean install'
        }
      }
    }
  }
}
