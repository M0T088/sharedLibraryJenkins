#!/usr/bin/groovy
def call() {
        sh '''
     mvn -v
     java --version
     docker --version
     docker-compose --version
     ansible --version
     sshpass -V
    '''
}
