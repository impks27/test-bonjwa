node {
    def workspace = "test-bonjwa-${BUILD_NUMBER}"
    def pipeline
    dir(workspace) {
        checkout scm
        pipeline = load "Pipeline.groovy"
        pipeline.dockerize()
    }
}
/*
@Library('SharedLibrary@master')_
import org.foo.Utilities
def utils = new Utilities(this)
utils.getMessage()
*/
