pipeline {
    agent { docker { image 'cosorio/gcp_jenkins' } }
    environment {
            USER = 'root'
    }
    stages {

           stage('chmod') {
                steps {
                    withCredentials([file(credentialsId: 'google-container-registry', variable: 'GOOGLE_AUTH')]) {
                    script {
                        docker.image('google/cloud-sdk:latest').inside {
                            sh "echo ${GOOGLE_AUTH} > gcp-key.json"
                            sh 'gcloud auth activate-service-account --key-file ./service-account-creds.json'
                        }
                    }
                }
                }
            }
      	    stage('version sdk gcp') {
                steps {
                    sh 'gcloud auth activate-service-account --key-file key.json'
                }
            }
    }
}
