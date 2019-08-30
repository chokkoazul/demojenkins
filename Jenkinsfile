lpipeline {
    agent { docker { image 'google/cloud-sdk' } }
    stages {
           # stage('crear carpeta gcloud') {
            #    steps {
             #       sh 'mkdir  ~/.config'
             #   }
           # }
	    stage('version sdk gcp') {
                steps {
                    sh 'gcloud auth activate-service-account --key-file key.json'
                }
            }
}
}
