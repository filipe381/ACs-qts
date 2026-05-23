pipeline {
  agent any
  options {
    timestamps()
  }
  environment {
    SELENIUM_REMOTE_URL = 'http://selenium:4444/wd/hub'
  }
  stages {
    stage('Prepare') {
      steps {
        sh 'rm -rf selenium'
        sh 'cp -r /workspace/selenium .'
      }
    }
    stage('Install') {
      steps {
        dir('selenium') {
          sh '''
            python3 -m venv venv
            . venv/bin/activate
            pip install --upgrade pip
            pip install -r requirements.txt
          '''
        }
      }
    }
    stage('Run') {
      steps {
        dir('selenium') {
          sh '''
            . venv/bin/activate
            python script.py
          '''
        }
      }
    }
    stage('Collect Video') {
      steps {
        sh 'sleep 5'
        sh '''
          mkdir -p selenium/videos
          cp /workspace/selenium/videos/*.mp4 selenium/videos/ 2>/dev/null || echo "No video file found yet"
          ls -la selenium/videos/ || true
        '''
      }
    }
  }
  post {
    always {
      junit allowEmptyResults: true, testResults: 'selenium/test-reports/*.xml'
      archiveArtifacts artifacts: 'selenium/test-reports/**, selenium/videos/*.mp4', allowEmptyArchive: true
    }
  }
}
