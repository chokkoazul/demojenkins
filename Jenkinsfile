pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
            stage('Test') {
                steps {
                    sh 'mvn testaa'
                }
            }
        }
     post {
            always {
                junit 'build/reports/**/*.xml'
            }
             failure {
                    mail to: 'osoriocri@gmail.com.com',
                         subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                         body: "Something is wrong with ${env.BUILD_URL}"
                }
        }
}