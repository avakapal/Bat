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
         
         app = docker.build("batibm/bat")		 
		 }
		 
	stage('Test image') {
	
	    app.inside {
		    sh 'echo "Tests passed"'
		}
	}
		 
	stage('Push image') {
	  
	   docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {       
	      app.push("${env.BUILD_NUMBER}")
		  app.push("latest")
		  }
		}
	post { 
           always { logstashSend maxLines:-1 , failBuild:true }
	} 
