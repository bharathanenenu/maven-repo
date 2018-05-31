pipeline { 
    agent any 
    stages {
    stage('Code Checkout') { 
            steps { 
                
            }
        }
        stage('Build') { 
            steps { 
                
            }
        }
        stage('Test'){
            steps {
                sh 'make check'
                junit 'reports/**/*.xml' 
            }
        }
        stage('Deploy') {
            steps {
                sh 'make publish'
            }
        }
    }
}
