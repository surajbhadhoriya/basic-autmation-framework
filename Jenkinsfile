pipeline {
    agent any
    
  stages {
    stage ('Compile Stage') {
      steps {
             withMaven(maven : 'Default') 
        {
        sh 'mvn clean compile'
        }
        
      }
    }
  stage ('Testing Stage')
    {
      step {
             withMaven(maven : 'Default') 
        {
        sh 'mvn test'
        }
                 
      }
    }
    
    stage ('Deployment Stage')
    {
      step {
             withMaven(maven : 'Default') 
        {
        sh 'mvn deploy'
        }          
      }
   
    }
  }
}
