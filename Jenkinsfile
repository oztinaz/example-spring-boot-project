pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "oztinaz/example-spring-boot-project"
    }
    stages {
        stage('Build & Push Docker Image') {
            steps {
                script {
                    sh "docker build -t ${DOCKER_IMAGE} ."
                    sh "docker push ${DOCKER_IMAGE}"
                }
            }
        }
        stage('Kubernetes') {
            steps {
                script {
                    sh "kubectl apply -f deployment.yaml"
                    sh "minikube service demo1"
                }
            }
        }
    }
}