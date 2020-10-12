package de.academy

class Maven implements Serializable {
  def steps
  Maven(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
