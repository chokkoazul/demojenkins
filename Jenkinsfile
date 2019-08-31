pipeline {
    agent { docker { image 'cosorio/gcp_jenkins' } }
    stages {
            stage('carga script') {
                steps {
                    sh './test.sh'
                }
            }
      	    stage('version sdk gcp') {
                steps {
                    sh 'gcloud auth activate-service-account --key-file key.json'
                }
            }
}
}
