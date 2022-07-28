
pipeline {
    agent none
    stages {
        stage("test") {
            steps {
                script {
                    echo "testing app"
                    echo "executing pipeline for branch $BRANCH_NAME"
                    //gv.buildJar()
                }
            }
        }
        stage("build") {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    echo "building app"
                    //gv.buildImage()
                }
            }
        }
        stage("deploy") {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    echo "deploying"
                    //gv.deployApp()
                }
            }
        }
    }   
}
