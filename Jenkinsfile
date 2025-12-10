pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kiromaged/ci-demo-java.git'
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
