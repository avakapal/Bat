
pipeline {
  agent { docker }
  stages{
       stage('push images'){
        steps{
          docker.withRegistry('https://localhost:5000', 'local-registry') {
            sh 'docker push pipelineimage'
          }
        }
       }
      }
}

        

              
 
     
   
   
  


       
   
  
  


                            
