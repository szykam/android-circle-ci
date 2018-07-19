pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/szykam/android-circle-ci', branch: 'develop', changelog: true, poll: true)
      }
    }
  }
}