import de.academy.Utilities

def utils = new Utilities(this)
node {
  utils.mvn 'compile'
}
