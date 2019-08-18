pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('run') {
            steps {
                sh 'mvn clean'
                sh 'mvn spring-boot:run'
            }
        }
    }
}