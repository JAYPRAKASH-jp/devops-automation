pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '7c145cd0-047a-4853-b1fc-64e5e6bde6ad', url: 'https://github.com/JAYPRAKASH-jp/devops-automation']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t jauntyjp/devops-automation .'
                }
            }
        }
        stage('Push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpassword')]) {
                        // some block
                        bat "docker login -u jauntyjp -p ${dockerhubpassword}"
                    }
                        bat 'docker push jauntyjp/devops-automation '
                    
                }
            }
        }
        stage('Deploy to k8s'){
            steps{
                script{
                    kubernetesDeploy configs: 'deploymentservice.yaml', kubeconfigId: 'k8sconfig'
                }
            }
        }
    }
}