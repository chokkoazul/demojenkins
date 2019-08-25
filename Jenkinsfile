pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
            stage('Clean') {
                steps {
                    sh './test.sh'
                }
            }
            stage('version sdk gcp') {
                steps {
                    sh 'gcloud version'
                }
            }
        stage('Sanity check') {
                    steps {
                        input "Todo ok para seguir?"
                    }
                }
        stage('Test') {
                            steps {
                                sh 'mvn test'
                            }
                        }
        }
}
