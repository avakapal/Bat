
pipeline {
  agent any
  stages {
    
     stage('Push image') {
          steps {
              withDockerRegistry([ credentialsId: "docker-hub-credentials", url: "https://registry.hub.docker.com" ]) {
              sh 'docker push pipelineimage '   
              }
          }
        }
  }
    
    post { 
    always { logstashSend maxLines:-1 ,failBuild:true }
  }

}         

    
   


   
   
  


       
   
  
  


                            
