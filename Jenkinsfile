pipeline {
  agent any
  tools {
    maven "maven"
  }
  stages {
    stage ('Maven clean') {
      steps {
      sh 'mvn clean'
      }
  
    }
    
    stage ("Maven build") {
      steps {
      sh 'mvn build'
      }
    
    } 
    
  }
  
  













}
