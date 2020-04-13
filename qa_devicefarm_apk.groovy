pipeline {
  agent {
    label "master"
  }
  parameters {
    //choice(choices: ['master','development'], description: 'Development/Master', name: 'MODULE_BRANCH')
    //string name: 'MODULE_BRANCH', defaultValue: 'master', description: 'Select TAF branc'
    string name: 'TAF_BRANCH', defaultValue: 'master', description: 'Select TAF branch'
    //selector: [$class: 'SpecificBuildSelector', buildNumber: '${BUILD_NUMBER}']
    string name: 'BUILD_NUM', defaultValue: 'latest', description: 'enter neded build for test'
    choice(choices: ['master','development'], description: 'Development/Master', name: 'APP_BRANCH')
    //choice(choices: ['IOS','Android'], description: 'Devicepool', name: 'DEVICEPOOLCHOISE')
  } 

   stages {
    stage ("Update the code"){
    parallel {
        stage("Get the APP"){
           steps{
            withCredentials([string(credentialsId: 'jenkins-nexus-string', variable: 'NEXUS_USER')]) {
            sh "curl --user '${NEXUS_USER}' \
              --output '${env.APP_NAME}-${env.APP_BRANCH}-${env.BUILD_NUM}.apk' \
              '${env.NEXUS_REPO_URL}/${env.APP_NAME}-${env.APP_BRANCH}-${env.BUILD_NUM}-v${BUILD_NUMBER}.apk'"
            }
            //sh "ls -alH"

                // withCredentials([string(credentialsId: 'jenkins-nexus-string', variable: 'NEXUS_USER')]) {
                // sh "curl --user '${NEXUS_USER}' --output '${env.APPLICATION_NAME}.apk' \
                // '${env.NEXUS_REPO_URL}/${env.APPLICATION_NAME}-${env.MODULE_BRANCH}-${env.BUILD_NUM}.apk'"
                //}
       //         copyArtifacts filter: 'artifacts/*', fingerprintArtifacts: true, projectName: '${appbranch}' , selector: [$class: 'SpecificBuildSelector', buildNumber: '${BUILD_NUM}']
                //sh "ls -alH"
       //         sh "ls -alH ./artifacts"

           }
       }
       stage("Checkout QA") {
           steps {
               git branch: "${env.TAF_BRANCH}", credentialsId: 'jenkins_id_rsa', url: 'git@git.opinov8.com:spin/TAF.git'
               sh "ls -al"
           }
       }
    }
    }
       stage("Build QA Framework"){
           steps{
               sh "/opt/maven/bin/mvn clean package -DskipTests=true"
           }
       }


       stage ("RUN AWS DF"){
           steps{
               // sh "ls -alH"
               // sh "ls -alH ./target/"
               // sh "ls -alH ./artifacts"
               devicefarm appArtifact: "${env.APP_NAME}-${env.APP_BRANCH}-${env.BUILD_NUM}.apk", 
               appiumJavaJUnitTest: '', 
               appiumJavaTestNGTest: 'target/zip-with-dependencies.zip', 
               appiumNodeTest: '', 
               appiumPythonTest: '', 
               appiumRubyTest: '', 
               appiumVersionJunit: '1.4.16', 
               appiumVersionPython: '1.4.16', 
               appiumVersionTestng: '1.9.1', 
               calabashFeatures: '', 
               calabashProfile: '', 
               calabashTags: '', 
               deviceLatitude: 47.6204, 
               deviceLocation: false, 
               deviceLongitude: -122.3941, 
               devicePoolName: "${env.DEVICEPOOLCHOISE}", 
               environmentToRun: 'CustomEnvironment', 
               eventCount: '', 
               eventThrottle: '', 
               extraData: false, 
               extraDataArtifact: '', 
               ifAppPerformanceMonitoring: true, 
               ifBluetooth: true, 
               ifGPS: true, 
               ifNfc: true, 
               ifSkipAppResigning: false, 
               ifVideoRecording: true, 
               ifVpce: false, 
               ifWebApp: false, 
               ifWifi: true, 
               ignoreRunError: false, 
               isRunUnmetered: false, 
               jobTimeoutMinutes: 60, 
               junitArtifact: '', 
               junitFilter: '', 
               password: '', 
               projectName: 'SPIN-Mobile', 
               radioDetails: false, 
               runName: "${env.APP_NAME}-${env.APP_BRANCH}-${env.BUILD_NUM}-v${BUILD_NUMBER}", 
               seed: '', 
               storeResults: false, 
               testSpecName: 'Default TestSpec for Android Appium Java TestNG', 
               testToRun: 'APPIUM_JAVA_TESTNG', 
               uiautomationArtifact: '', 
               uiautomatorArtifact: '', 
               uiautomatorFilter: '', 
               username: '', 
               vpceServiceName: '', 
               xctestArtifact: '', 
               xctestFilter: '', 
               xctestUiArtifact: '', 
               xctestUiFilter: ''
          }
       }
   }

  // post {
  //   cleanup {
  //       //cleanWs()
  //   }  
  // } 
}