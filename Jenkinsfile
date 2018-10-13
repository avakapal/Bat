
pipeline {
  agent any
  stages{
       stage('push images'){
        steps{
          withDockerRegistry('https://localhost:5000', 'local-registry') {
            sh 'docker push pipelineimage'
          }
        }
       }
  }
}
         
        

        

              
 
     
   
   
  


       
   
  
  


                            
