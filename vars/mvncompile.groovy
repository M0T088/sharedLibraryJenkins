@Library('utils') import de.academy.Maven

def utils = new Maven(this)
node {
  utils.mvn 'compile'
}
