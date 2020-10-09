def call() {
    ansiblePlaybook inventory: 'inventory', installation: 'ansible', playbook: 'deploy.yml', disableHostKeyChecking: true
}
