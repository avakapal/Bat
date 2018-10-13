
pipeline {
  agent any
  stages{
       stage("SonarQube Analysis"){
         steps{
              def mvnHome=tool name: ‘Maven’
              withSonarQubeEnv(‘SonarQube’){
              sh “&{mvnHome}/bin/mvn sonar:sonar”
              }
         }
       }
  }
}

        
 
  


       
   
  
  


                            
