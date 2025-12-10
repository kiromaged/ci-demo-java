pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yourusername/yourrepo.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Report Tests') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
