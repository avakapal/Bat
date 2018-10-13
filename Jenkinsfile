
pipeline {
  agent any
    stages{
      stage ('Artifactory configuration'){
      steps{
        script{
          def server = Artifactory.server "JFROG"
            def rtMaven = Artifactory.newMavenBuild()
          rtMaven.resolver server: server, releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot'
          rtMaven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
          rtMaven.tool = 'Maven'
          buildInfo = Artifactory.newBuildInfo()
        }
      }
    }
    
        stage('Exec Maven'){
          steps{
            script{
        def buildInfo = rtMaven.run pom: ' /root/pipeline-jfrog/Bat/pom.xml', goals: 'clean install' , buildInfo: 'buildInfo'    
        rtMaven.deployer.deployArtifacts buildInfo
        server.publishBuildInfo buildInfo
            }
          }
        }
        
      }
    }

  

         


        
 
  


       
   
  
  


                            
