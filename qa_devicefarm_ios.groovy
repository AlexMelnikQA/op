pipeline {
 agent {
    label "master"
 }
  parameters {
    //string name: 'MODULE_BRANCH', defaultValue: 'master', description: 'Select IOS app branch'
    //choice(choices: [env.DEVICEPOOL], description: 'Devicepool', name: 'DEVICEPOOL')
    choice name: 'MODULE_BRANCH', choices: ['master','development'], description: 'Development/Master'
    string name: 'TAF_BRANCH', defaultValue: 'master', description: 'Select TAF branch'
    string name: 'BUILD_NUM', defaultValue: 'latest', description: 'enter neded build for test'
    //choice(choices: [env.DEVICEPOOL], description: 'Devicepool', name: 'DEVICEPOOL')
    //hoice(choices: [env.DEVICEPOOL], description: 'Devicepool', name: 'DEVICEPOOLCHOISE')
  } 
   stages {
        stage("Get the APP"){
           steps{
                withCredentials([string(credentialsId: 'jenkins-nexus-string', variable: 'NEXUS_USER')]) {
                    sh "curl --user '${NEXUS_USER}' --output '${env.APPLICATION_NAME}.ipa' \
                    '${env.NEXUS_REPO_URL}/${env.APPLICATION_NAME}-${env.MODULE_BRANCH}-${env.BUILD_NUM}-v${BUILD_NUMBER}.ipa'"
                }

           }
       }

       stage("Checkout QA") {
           steps {
               git branch: "${env.TAF_BRANCH}", credentialsId: 'jenkins_id_rsa', url: 'git@git.opinov8.com:spin/TAF.git'
           }
       }
       stage("Build QA Framework"){
           steps{
               sh "/opt/maven/bin/mvn clean package -DskipTests=true"
           }
       }


//https://ci.opinov8.com/nexus/repository/spin-builds/spin-master-latest.ipa
//https://ci.opinov8.com/nexus/repository/spin-builds/spin-master-lastest.ipa

       stage ("RUN AWS DFT"){
           steps{
               sh "ls -alH"
               devicefarm appArtifact: "${env.APPLICATION_NAME}-${env.MODULE_BRANCH}-${env.BUILD_NUM}.ipa", 
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
               runName: "${env.APPLICATION_NAME}-${env.MODULE_BRANCH}-${env.BUILD_NUM}-v${BUILD_NUMBER}", 
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

  post {
    cleanup {
        cleanWs()
    }  
  }    
}