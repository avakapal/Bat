
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
                  args '-v  /opt/registry/data:/var/lib/registry'
               // sh 'docker push pipelineimage2'
                  app.push()
                }
                }
            }
          }
    }
  }
}
   
 
  


       
   
  
  


                            
