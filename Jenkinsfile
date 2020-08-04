node {
    def workspace = "test-bonjwa-${BUILD_NUMBER}"
    def pipeline
    dir(workspace) {
        checkout scm
        pipeline = load "Pipeline.groovy"
        //pipeline.dockerize()
        pipeline.deploy()
    }
}
