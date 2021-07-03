pipeline{
    agent {
        label 'master'
    }

    stages{
        stage('iTest源码') {
            steps {
                sh 'mkdir -p iTest'
                dir("iTest"){
                    git branch:'master', url:'git@github.com:princeqjzh/iTest.git'
                }
            }
        }

        stage('构建+单测') {
            steps {
                sh '''
                    cd iTest
                    mvn clean install test
                '''
            }
        }

        stage('发布测试记录') {
            steps {
                junit '**/*.xml'
            }
        }
    }
}