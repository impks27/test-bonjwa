def checkout() {
    checkout scm
}

def dockerize() {
    try {
        def ret = bat(script: 'dir', returnStdout: true)
        println ret
        //docker build -t java-app .
    } catch (e) {
        println e
    }   
}
