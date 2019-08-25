pipeline {
    agent { docker { image 'google/cloud-sdk' } }
    stages {
            stage('version sdk gcp') {
                steps {
                    sh 'gcloud version'
                }
            }
}
}
