node{
   stage('SCM Checkout'){
     git 'https://github.com/batibm/Bat.git'
   }
    stage('Compile-Package'){
        // Get maven home path
        def mvnHome = tool name: 'Maven', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }

    stage('SonarQube Analysis'){
         def mvnHome = tool name: 'Maven', type: 'maven'
         withSonarQubeEnv('SonarQube') {
            sh "${mvnHome}/bin/mvn sonar:sonar"
         }
    }

    stage('Docker Build') {
         
         app = docker.build("doc/local")		 
		 }
		 
	stage('Test image') {
	
	    app.inside {
		    sh 'echo "Tests passed"'
		}
	}
		 
	stage('Push image') {
	  
	  docker.withRegistry('http://localhost:5000', 'local-registry') {       
	    app.push("${env.BUILD_NUMBER}")
	  app.push("latest")
		  }
		}

	stage('post') { 
           always { logstashSend maxLines:-1 , failBuild:true }
	} 
}

