def call() {
library identifier: 'Test@master', 
    //'master' refers to a valid git-ref
    //'mylibraryname' can be any name
retriever: modernSCM([
  $class: 'GitSCMSource',
  credentialsId: 'your-credentials-id',
  remote: 'https://github.com/devops-dus-2020/sharedLibraryJenkins.git'
])
}
