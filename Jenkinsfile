
pipeline {
  agent any
  stages{
    steps{
       def server = Artifactory.server url:"http://159.122.149.247:8081/artifactory/"
      //def server = Artifactory.newServer url: SERVER_URL, credentialsId: CREDENTIALS
        def rtMaven = Artifactory.newMavenBuild()
        rtMaven.resolver server: server, releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot'
        rtMaven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
        rtMaven.tool = 'Maven'
        env.MAVEN_HOME = '/tools/apache-maven-3.5.4'
        rtMaven.opts = '-Xms1024m -Xmx4096m'
        def buildInfo = rtMaven.run pom: ' /root/pipeline-jfrog/Bat/pom.xml', goals: 'clean install' , buildInfo: 'buildInfo'
        rtMaven.deployer.deployArtifacts buildInfo
        server.publishBuildInfo buildInfo
    }
  }
}


         


        
 
  


       
   
  
  


                            
