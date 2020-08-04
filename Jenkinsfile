node {
    def workspace = "test-bonjwa-${BUILD_NUMBER}"
    stage('Checkout') {
        dir(workspace) {
            checkout scm
        }
    }
    stage('Dockerize') {
        dir(workspace) {
            try {
                def ret = bat(script: 'dir', returnStdout: true)
                println ret
                //docker build -t java-app .
            } catch (e) {
                println e
            }
        }
    }
}
/*
@Library('SharedLibrary@master')_
import org.foo.Utilities
def utils = new Utilities(this)
utils.getMessage()
*/
