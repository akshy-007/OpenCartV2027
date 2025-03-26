pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    echo "Building the project..."
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "Running Selenium Tests..."
                    sh 'mvn test'
                }
            }
        }

        stage('Report') {
            steps {
                script {
                    echo "Generating Test Reports..."
                    sh 'mvn surefire-report:report'
                }
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', fingerprint: true
        }
    }
}
