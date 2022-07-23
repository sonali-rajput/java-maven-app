def buildApp() {
    echo 'building the application..'
}

def testApp() {
    echo 'testing the application..'
}

def deployApp() {
    echo 'deplloying the app..'
    echo "deplloying version ${params.VERSION}"
}

return this