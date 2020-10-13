package de.academy.maven

interface MavenExecutor extends Serializable {
    void stage(String name, Closure config)
    String sh(String command)
    void echo(String message)
}
