package de.academy.maven

import de.academy.maven.MavenExecutor
import org.junit.jupiter.api.Test

import static org.mockito.Mockito.*

class Test {
    JenkinsExecutor mavenExecutor = mock(MavenExecutor)
    MyCustomSteps myCustomSteps = new MyCustomSteps(mavenExecutor)

    @Test
    void "can execute custom steps"() {
        when(jenkinsExecutor.sh('mvn clean compile')).thenReturn("""[INFO] Scanning for projects...""")
        myCustomSteps.execute()
        verify(jenkinsExecutor).sh('mvn clean compile')
        verify(jenkinsExecutor).echo('Laeuft!')
    }
}