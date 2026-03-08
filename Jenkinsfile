pipeline {
    agent any

    stages {
        stage('Build Maven') {
            steps {
                git branch: 'main', url: 'https://github.com/PunugotiVidya/sb-devops'
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t punugotividyasagar/sb-devops:latest .'
            }
        }

        stage('Login to Docker Hub') {
            steps {
                bat 'docker login -u punugoti.vidyasagar@gmail.com -p Cloud@123'
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push punugotividyasagar/sb-devops:latest'
            }
        }
    }
}