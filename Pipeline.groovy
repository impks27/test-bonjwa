def dockerize() {
    try {
        buildImage()
    } catch (e) {
        println e
    }
}

def buildImage() {
    def registry = "impks/test-bonjwa"
    stage('Build Image') {
        docker.build registry + ":$BUILD_NUMBER"
    }
}

return this;
