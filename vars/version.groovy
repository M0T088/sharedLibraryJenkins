def var() {
        sh '''
     mvn -v
     java --version
     docker --version
     docker-compose --version
     ansible --version
     sshpass -V
    '''
}