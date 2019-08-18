pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
            stage('Test') {
                steps {
                    sh 'mvn test'
                }
            }
        }
     post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
}