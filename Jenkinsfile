node {
    stage("SCM checkout") {
        git 'https://github.com/lfpimenta/interestCalculatorSimple'
    }
    stage("Clean") {
        sh 'mvn clean'
    }
    stage("Compile-package") {
        sh 'mvn package'
    }
}