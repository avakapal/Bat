
pipeline {
  agent any
  stages{
       stage('push images'){
        steps{
           withDockerServer([uri: "tcp://localhost:5000"]) {
           withDockerRegistry([credentialsId: 'local-registry', url: "https://159.122.149.247:5000/"]){
            sh 'docker push pipelineimage'
           }
           }
        }
       }
  }
}

          
   
        

              
 
     
   
   
  


       
   
  
  


                            
