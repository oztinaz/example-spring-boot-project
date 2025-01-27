pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "oztinaz/demo1"
    }
    stages {
        stage('Build & Push Docker Image') {
            steps {
                script {
                    echo "credentials"
                    withCredentials([usernamePassword(credentialsId: '6cf59713-a1eb-415b-80df-e37583b4d544', passwordVariable: 'password', usernameVariable: 'username')]) {
                        sh "docker login -u $username -p $password"
                    }
                    sh "docker build -t ${DOCKER_IMAGE} ."
                    sh "docker push ${DOCKER_IMAGE}"
                }
            }
        }k
        stage('Kubernetes') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'f3ed1fcc-f6a0-4ac6-9166-97cb3613b801', passwordVariable: 'password', usernameVariable: 'username')]) {
                        sh "kubectl auth --username $username --password $password"
                    }
                    sh "kubectl apply -f deployment.yaml"
                    sh "minikube service demo1"
                }
            }
        }
    }
}