node {
    def workspace = "test-bonjwa-${BUILD_NUMBER}"
    def pipeline = load "Pipeline.groovy"
    stage('Checkout') {
        dir(workspace) {
            pipeline.checkout()
        }
    }
    stage('Dockerize') {
        dir(workspace) {
            pipeline.dockerize()
        }
    }
}
/*
@Library('SharedLibrary@master')_
import org.foo.Utilities
def utils = new Utilities(this)
utils.getMessage()
*/
