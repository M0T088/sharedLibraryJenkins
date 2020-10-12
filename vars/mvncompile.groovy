import de.academy.*

def utils = new Maven()
node {
  utils.mvn 'compile'
}
