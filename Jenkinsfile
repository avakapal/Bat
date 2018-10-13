
pipeline {
  agent any
  stages{
    stage('Build image') {
          steps {
            echo 'Starting to build docker image'
            script {
                def  app = docker.build(" pipelineimage2")
                withDockerServer([uri: "tcp://159.122.149.247:5000"]) {
                withDockerRegistry([credentialsId: 'local-registry', url: "https://159.122.149.247:5000/"]){
               // sh 'docker push pipelineimage2'
                  app.push()
                }
                }
            }
          }
    }
  }
}
   
        

              
 
     
   
   
  


       
   
  
  


                            
