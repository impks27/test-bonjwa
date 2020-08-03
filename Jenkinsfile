node {
    stage('Dockerize') {
        try {
            //sh "pwd"
            def ret = sh(script: 'dir', returnStdout: true)
            println ret
        }
        catch (e) {
            //echo 'Something failed, I should sound the klaxons!'
            //throw
            println e
        }
    }
}
