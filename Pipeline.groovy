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
    stage('Deploy to k8s') {
        kubernetesDeploy(
            kubeconfigId: 'kubeconfig',
            configs: 'k8s.yml',
            enableConfigSubstitution: true
        )
    }
}

def build() {
    stage('Build App') {
        bat "gradlew clean build"
    }
}
return this;

//bat "kubectl cluster-info"
//bat "kubectl apply -f k8s.yml"
/*withCredentials([kubeconfigFile(credentialsId: 'acs-ssh-folder', variable: 'KUBECONFIG')]) {
    sh '''cat $KUBECONFIG'''
}*/
/*withCredentials([kubeconfigContent(credentialsId: 'kubeconfig', variable: 'KUBECONFIG_CONTENT')]) {
    bat "kubectl cluster-info"
}*/
