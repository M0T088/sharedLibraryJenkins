import de.academy.*

def utils = new Utilities(this)
node {
  utils.mvn 'compile'
}
