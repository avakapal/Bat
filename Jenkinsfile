
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
         maven: 'Maven '
        ) {
             sh 'mvn clean deploy' 
        }
      }
    }
  }
  post { 
    always { logstashSend failBuild:true }
  }
}

       
   
  
  


                            
