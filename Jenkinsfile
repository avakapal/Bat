
pipeline {
  agent any
  def server = Artifactory.server url:"http://159.122.149.247:8081/artifactory/"
       def rtMaven = Artifactory.newMavenBuild()
  stages{
    stage ('Artifactory configuration'){
      steps{
        rtMaven.resolver server: server, releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot'
        rtMaven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
        rtMaven.tool = 'Maven'
        buildInfo = Artifactory.newBuildInfo()
      }
    }
    
        stage(Exec Maven){
          steps{
        def buildInfo = rtMaven.run pom: ' /root/pipeline-jfrog/Bat/pom.xml', goals: 'clean install' , buildInfo: 'buildInfo'    
        rtMaven.deployer.deployArtifacts buildInfo
        server.publishBuildInfo buildInfo
          }
        }
        
      }
    }

  

         


        
 
  


       
   
  
  


                            
