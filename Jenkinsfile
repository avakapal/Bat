
pipeline {
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage('Maven build'){
      steps {
          sh 'mvn clean install'
      }
    }
  }
}
