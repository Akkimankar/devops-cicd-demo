pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                
            }
        }
        stage('Build') { 
            steps {  
                echo "Build successful"            
            }
        }
        stage('Test') { 
            steps {
                echo "Test successful"                
            }
        }
        stage('Deploy') { 
            steps {  
               echo "deploy successful"       
            }
        }
    }
}