pipeline {
    agent any
     tools {
        maven 'Default' 
    }
    
  stages {
    stage ('Compile Stage') {
      steps {
             //withMaven(maven : 'Default') 
        //{
        sh 'mvn clean compile'
        //}
        
      }
    }
  stage ('Testing Stage')
    {
      steps {
             //withMaven(maven : 'Default') 
       // {
        sh 'mvn test'
       // }
                 
      }
    }
    
    stage ('Deployment Stage')
    {
      steps{
            // withMaven(maven : 'Default') 
       // {
        sh 'mvn deploy'
       // }          
      }
   
    }
  }
}
