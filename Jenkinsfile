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
        bat 'mvn clean compile'
        //}
        
      }
    }
  stage ('Testing Stage')
    {
      steps {
             //withMaven(maven : 'Default') 
       // {
        bat 'mvn test'
       // }
                 
      }
    }
    
    stage ('Deployment Stage')
    {
      steps{
            // withMaven(maven : 'Default') 
       // {
        bat 'mvn deploy'
       // }          
      }
   
    }
  }
}
