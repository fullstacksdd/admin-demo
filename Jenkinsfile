node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn} C:/apps/apache-maven-3.8.6/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=sonarqube-github"
    }
  }
}
