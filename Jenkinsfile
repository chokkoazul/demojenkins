pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
            stage('Test') {
                steps {
                    sh 'chmod 775 test.sh'
                    sh './test.sh'
                }
            }
        }
}