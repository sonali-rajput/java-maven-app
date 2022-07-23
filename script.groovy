def buildJar() {
    echo "building jar"
    sh 'mvn package'
}

def buildImage() {
    echo "building the docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push sonalirajput/demo-app:jma-2.0'
        sh 'docker build -t sonalirajput/demo-app:jma-2.0 .'
    }
}

def deployApp() {
    echo 'deplloying the app..'
}

return this