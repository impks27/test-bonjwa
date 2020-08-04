def dockerImage
def registry = "impks/test-bonjwa"
def registryCredential = "impks-dockerHub"

def dockerize() {
    try {
        buildAndPushImage()
    } catch (e) {
        println e
    }
}

def buildAndPushImage() {
    registry = "impks/test-bonjwa"
    registryCredential = "impks-dockerHub"
    stage('Build and Push Image') {
        dockerImage = docker.build registry + ":latest" //":$BUILD_NUMBER" Setting latest for demo
        docker.withRegistry('', registryCredential) {
            dockerImage.push()
        }
    }
}

def deploy() {
    bat "kubectl apply -f k8s.yml"
}
return this;
