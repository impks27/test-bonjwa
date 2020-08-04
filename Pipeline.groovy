def dockerize() {
    try {
        buildAndPushImage()
    } catch (e) {
        println e
    }
}

def buildAndPushImage() {
    def registry = "impks/test-bonjwa"
    def registryCredential = "impks-dockerHub"
    stage('Build and Push Image') {
        dockerImage = docker.build registry + ":$BUILD_NUMBER"
        docker.withRegistry('', registryCredential) {
            dockerImage.push()
        }
    }
}

return this;
