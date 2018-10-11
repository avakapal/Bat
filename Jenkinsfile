
pipeline {
  agent any
  stages {
     stage('Maven build'){ 
      steps { 
        withMaven( 
          maven: 'Maven' 
        ) { 
          sh 'mvn clean install' 
        }
      }
     }
  }
}
    
    
        //stage('Build image') {
         //app = docker.build("/var/lib/jenkins/workspace/Docker-Pipeline/target/hello-world-service-0.0.1-SNAPSHOT.jar")
      

  
  //post { 
   // always { logstashSend maxLines:-1 , failBuild:true }
  


   
   
  


       
   
  
  


                            
