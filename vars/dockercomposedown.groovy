#!/usr/bin/groovy
def call() {
    sleep (300)
    sh 'docker-compose down'
}