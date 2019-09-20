pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('version maven') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
