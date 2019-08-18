pipeline {
    agent { docker { image 'maven:3.3.3' } }
    environment {
            VAR_EXAMPLE_COSORIO = 'jejeje'
    }
    stages {
        stage('run') {
            steps {
                sh 'mvn clean'
                sh 'printenv'
            }
        }
    }
}