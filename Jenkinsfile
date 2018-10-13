pipeline {
       agent any
       	    stages{
        	      stage ('Artifactory configuration'){
              	      steps{
                 	        script{

                  	          def server = Artifactory.server "JFROG"  

        	                  def Maven = Artifactory.newMavenBuild()
       
             	              Maven.resolver server: server, releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot'
                              Maven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
                              Maven.tool = 'Maven'

        	                   buildInfo = Artifactory.newBuildInfo()
                            }
                      }
                  }

      
        	        stage('Exec Maven'){
        	          steps{
        	            script{
              	        def buildInfo = Maven.run pom: ' /root/pipeline-jfrog/Bat/pom.xml', goals: 'clean install' , buildInfo: 'buildInfo'    
                            Maven.deployer.deployArtifacts buildInfo
                            server.publishBuildInfo buildInfo
                        }
                      }
                    }
            }
}

                      

      
      

        	            

      
      

        	          

      
      

        	        }

      
      

        	        

      
      

        	      }

      
      

                }
                

     




