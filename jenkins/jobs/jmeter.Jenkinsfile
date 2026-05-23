pipeline {
  agent any
  options {
    timestamps()
    ansiColor('xterm')
  }
  stages {
    stage('Prepare') {
      steps {
        sh 'rm -rf results.jtl html-report Script_jmeter.jmx'
        sh 'cp /workspace/Script_jmeter.jmx .'
      }
    }
    stage('Run JMeter') {
      steps {
        sh '''
          jmeter -n \
            -t Script_jmeter.jmx \
            -l results.jtl \
            -e -o html-report
        '''
      }
    }
  }
  post {
    always {
      archiveArtifacts artifacts: 'results.jtl, html-report/**', allowEmptyArchive: true
      publishHTML(target: [
        reportName: 'JMeter HTML',
        reportDir: 'html-report',
        reportFiles: 'index.html',
        keepAll: true,
        alwaysLinkToLastBuild: true,
        allowMissing: true
      ])
      perfReport sourceDataFiles: 'results.jtl', errorFailedThreshold: 5
    }
  }
}
