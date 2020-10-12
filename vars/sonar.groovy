#!/usr/bin/groovy
def call() {
    configFileProvider([configFile(fileId: 'f3ef7a41-a468-41f2-8819-7a02ecf6050b', variable: 'MAVEN_GLOBAL_SETTINGS')]) {
    sh 'mvn -gs $MAVEN_GLOBAL_SETTINGS clean verify sonar:sonar'
    }
}
