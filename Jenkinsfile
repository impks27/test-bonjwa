node {
    stage('Dockerize') {
        try {
            def ret = bat(script: 'dir', returnStdout: true)
            println ret
        }
        catch (e) {
            //echo 'Something failed, I should sound the klaxons!'
            //throw
            println e
        }
    }
}
