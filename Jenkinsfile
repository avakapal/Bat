
pipeline {
  agent any
  stages {
    stage('Build image') {
      steps {
        echo 'Starting to build docker image'
        def  app = docker.build(" Pipeline-Image")
        app.push 'master'
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
  


   
   
  


       
   
  
  


                            
