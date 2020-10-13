package de.academy.maven

class MyCustomSteps implements Serializable {
    private final MavenExecutor mavenExecutor

    MyCustomSteps(MavenExecutor mavenExecutor) {
        this.mavenExecutor = mavenExecutor
    }

    void execute() {
        mavenExecutor.sh('mvn clean compile')
        mavenExecutor.echo('Laeuft!')
    }
}