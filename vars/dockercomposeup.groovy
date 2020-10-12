#!/usr/bin/groovy
def call() {
    sh 'docker-compose up --build -d'
}