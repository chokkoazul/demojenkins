pipeline {
    agent { docker { image 'google/cloud-sdk' } }
    stages {
        stage('autenticacion gcp') {
            steps {
                sh 'sudo gcloud auth activate-service-account --key-file key.json'
            }
        }
    }
}
