node {
    stage('Checkout') {
        checkout scm
    }
    stage('Dockerize') {
        try {
            def ret = bat(script: 'dir', returnStdout: true)
            println ret
        }
        catch (e) {
            println e
        }
    }
}
/*
@Library('SharedLibrary@master')_
import org.foo.Utilities
def utils = new Utilities(this)
utils.getMessage()
*/
