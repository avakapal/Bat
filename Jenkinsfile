
pipeline {
  agent any
  stages {
    stage('Cloning sources') {
      steps {
        git(url: 'https://github.com/batibm/Bat.git', branch: 'master', changelog: true)
      }
    }
    stage('Maven build'){
      steps {
        withMaven(
         maven: 'Maven 3.5.4 '
        ) {
           sh 'mvn clean compile'
        }
      }
    }
    stage ('Testing Stage') {
      steps {
         withMaven(maven : 'Maven 3.5.4') {
                    sh 'mvn test'
                }
            }
        }
    stage ('Deployment Stage') {
      steps {
                withMaven(maven : 'maven 3.5.4') {
                    sh 'mvn deploy'
                }
      }
    }
  }
  
}

                            
