pipeline {
  agent any
  options {
    timestamps()
  }
  environment {
    JAVA_HOME = '/opt/java/jdk-22'
    PATH = "${JAVA_HOME}/bin:${PATH}"
  }
  stages {
    stage('Prepare') {
      steps {
        sh 'rm -rf imcCalculator'
        sh 'cp -r /workspace/imcCalculator .'
      }
    }
    stage('Test') {
      steps {
        dir('imcCalculator') {
          sh 'mvn -B -ntp test'
        }
      }
    }
  }
  post {
    always {
      junit allowEmptyResults: true, testResults: 'imcCalculator/target/surefire-reports/*.xml'
      archiveArtifacts artifacts: 'imcCalculator/target/surefire-reports/**', allowEmptyArchive: true
    }
  }
}
