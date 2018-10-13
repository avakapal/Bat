pipeline{

    agent any

    stages{

       stage('Maven build'){ 

          steps { 

            withMaven( 

              maven: 'Maven' )

             { 

             sh 'mvn clean install' 

             }

          }

        }

   stage('Build image') {

      steps {

        echo 'Starting to build docker image'

        script {

           def  app = docker.build(" pipelineimage6")

            dockerFingerprintFrom([Dockerfile: "."])

        }

      }

   }

                }

                }

                      

      
      

        	            

      
      

        	          

      
      

        	        

      
      

        	        

      
      

        	      
      
      

                
                

     




