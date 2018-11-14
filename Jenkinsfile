node{
   stage('SCM Checkout'){
     git 'https://github.com/batibm/Bat.git'
   }
    stage('compile'){
        // Get maven home path
        def mvnHome = tool name: 'Maven', type: 'maven'
        sh "${mvnHome}/bin/mvn compile"
    }
	
	stage('test'){
        // Get maven home path
        def mvnHome = tool name: 'Maven', type: 'maven'
        sh "${mvnHome}/bin/mvn clean test"
    }

    stage('SonarQube Analysis'){
         def mvnHome = tool name: 'Maven', type: 'maven'
         withSonarQubeEnv('SonarQube') {
            sh "${mvnHome}/bin/mvn sonar:sonar"
         }
    }
	
	stage("SonarQube Quality Gate") { 
        timeout(time: 1, unit: 'HOURS') { 
           def qg = waitForQualityGate() 
           if (qg.status != 'OK') {
             error "Pipeline aborted due to quality gate failure: ${qg.status}"
           }
        }
    }
	
	stage('package'){
        // Get maven home path
        def mvnHome = tool name: 'Maven', type: 'maven'
        sh "${mvnHome}/bin/mvn clean package"
    }
	}

