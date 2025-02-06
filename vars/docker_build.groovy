def call(string projectName,String imageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
