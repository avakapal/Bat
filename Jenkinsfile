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
        withAnt()
      }
    }
    stage('Building image') {
      steps {
        input(message: 'build-img', id: 'building-img')
      }
    }
    stage('Push image') {
      steps {
        input(message: 'doc-pipeline-image', id: 'pipeline')
      }
    }
  }
}