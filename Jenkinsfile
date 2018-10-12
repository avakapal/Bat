
pipeline {
  agent any
  stages {
     stage('Build image') {
      steps {
        echo 'Starting to build docker image'
        script {
           def  app = docker.build(" Pipeline-Image:${env.BUILD_ID}")
        }
      }
    }
        stage('Push image') {
          steps {
              withDockerRegistry([ credentialsId: "docker-hub-credentials", url: "https://registry.hub.docker.com" ]) {
              sh 'docker push Pipeline-Image'         
            }
        }
    }
}         

    
   


   
   
  


       
   
  
  


                            
