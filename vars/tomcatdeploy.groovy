def call() {
    withCredentials([usernamePassword(credentialsId: 'tomcat', usernameVariable: 'TOMCAT_USER', passwordVariable: 'TOMCAT_PASSWORD')]) {
        configFileProvider([configFile(fileId: 'f3ef7a41-a468-41f2-8819-7a02ecf6050b', variable: 'MAVEN_GLOBAL_SETTINGS')]) {
        sh 'mvn -gs $MAVEN_GLOBAL_SETTINGS tomcat7:deploy -e -DskipTests -DdeployOnly'
        }
    }
}
