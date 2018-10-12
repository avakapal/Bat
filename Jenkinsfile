
pipeline {
  agent any
  stages {
    stage('Build image') {
      steps {
        echo 'Starting to build docker image'
        def  app = docker.build("/var/lib/jenkins/workspace/Pipeline-Image/target/hello-world-service-0.0.1-SNAPSHOT.jar")
        app.push()
    }
  }
}
    
    //stage('Maven build'){ 
      //steps { 
        //withMaven( 
          //maven: 'Maven' 
        //) { 
          //sh 'mvn clean install' 
            
      

  
  //post { 
   // always { logstashSend maxLines:-1 , failBuild:true }
  


   
   
  


       
   
  
  


                            
