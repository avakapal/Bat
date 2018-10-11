
pipeline {
  agent any
  stages {
    stage('Cloning sources') {
      steps {
        git(url: 'https://github.com/batibm/Bat.git', branch: 'master', changelog: true)
      }
    }
    stage('Artifactory configuration') {
      steps {
        rtMaven.tool = " Maven 3.5.4"
      }
    }
    stage('Maven build'){
       steps {
          buildInfo = rtMaven.run pom: '/root/Docker-Pipeline/Bat/Bat/pom.xml',goals: 'clean install'
      }
    }
    stage('Building image') {
      steps {
          app = docker.build("/var/lib/jenkins/workspace/Docker-Pipeline/target/Docker-Pipeline-0.0.1-SNAPSHOT.jar ")      
          input(message: 'build-img', id: 'building-img')
      }
    }
    stage('Push image') {
      steps {
        input(message: 'doc-pipeline-image', id: 'pipeline')
        app.push("/var/pipeline-img/")
        app.push("${env.BUILD_NUMBER}")
        app.push("latest")
      }
    }
  }
}
