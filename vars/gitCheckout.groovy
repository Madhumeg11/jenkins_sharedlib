def call(String repoUrl, String branch = null, String credentialId = null) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credentialId
        ]]
    ])
}
