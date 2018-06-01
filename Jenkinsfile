pipeline { 
    agent any 
    stages {
    stage('Code Checkout') { 
            steps { 
                git credentialsId: 'GithubID', url: 'https://github.com/bharathanenenu/maven-repo.git'
            }
        }
        stage('Build') { 
           steps { 
                echo 'Build triggered'
            }
        }
        stage('Test'){
           steps { 
                echo 'Test triggered'
            } 
        }
        stage('Deploy') {
           steps { 
                echo 'Deployed'
            }
        }
    }
}
