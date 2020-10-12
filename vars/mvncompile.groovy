import de.academy.*

def utils = new Utilities(steps)
node {
  utils.mvn 'compile'
}
