def call(String repoUrl, String branch = null, String credentialId = null) {

    def branchList = branch ? [[name: branch]] : []

    checkout([
        $class: 'GitSCM',
        branches: branchList,
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credentialId
        ]]
    ])
}
