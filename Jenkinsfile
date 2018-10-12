
pipeline {
  agent any
  stages {
    stage('Build image') {
      steps {
        echo 'Starting to build docker image'
        def  app = docker.build(" Pipeline-Image")
        stage('Push image') {
            docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
           // app.push("${env.BUILD_NUMBER}")
            app.push()
      }
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
  


   
   
  


       
   
  
  


                            
