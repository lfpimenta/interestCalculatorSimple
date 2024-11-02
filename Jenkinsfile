node {
    stage("SCM checkout") {
        git branch: 'main', url: 'https://github.com/lfpimenta/interestCalculatorSimple'
    }
    stage("Clean") {
        sh 'mvn clean'
    }
    stage("Compile-package") {
        sh 'mvn package'
    }
}