pipeline {
    agent any
       tools {
        maven "maven"
       }
    environment {
        NEXUS_VERSION = "nexus3"
        NEXUS_PROTOCOL = "http"
        NEXUS_URL = "207.180.211.157:8081"
        NEXUS_REPOSITORY = "elab_back"
        NEXUS_CREDENTIAL_ID = "iheb-user-credentials"
    }
    stages {
        stage('Git Checkout') {
            steps {
                script {
                    git branch: 'develop',
                        credentialsId: 'Git_acc	',
                        url: 'https://gitlab.dpc.com.tn/DPCProject/beehive-learning_back.git'
                        
                }
            }
        }
        stage('build') {
          steps {
             echo 'Notify GitLab'
             updateGitlabCommitStatus name: 'build', state: 'pending'
             echo 'build step goes here'
             updateGitlabCommitStatus name: 'build', state: 'success'
               sh 'mvn -Dmaven.test.skip=TRUE install'
                echo '>> start runnig war file'
                 archiveArtifacts artifacts: '**/target/*.war'

          }
       }
       
       stage(test) {
           steps {
               echo 'Notify GitLab'
               updateGitlabCommitStatus name: 'test', state: 'pending'
               echo 'test step goes here'
               updateGitlabCommitStatus name: 'test', state: 'success'
               sh 'mvn -Dmaven.test.skip=TRUE install'
               echo '>> start runnig war file'


           }
       }
       
         stage ('OWASP Dependency-Check Vulnerabilities') {  
    steps {  
     withMaven(maven : 'maven') {  
      sh 'mvn dependency-check:check'  
     }  
   
     dependencyCheckPublisher pattern: 'target/dependency-check-report.xml'  
    }  
   }
   stage ('Code Quality Check via SonarQube') {
            steps {
               withSonarQubeEnv(installationName: 'sonarqube-acc', credentialsId: 'sonar-158') {
                sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
   
