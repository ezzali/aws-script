import groovy.json.*

def env = System.getenv()

def jsonSlurper = new JsonSlurper()
def roleOutput = jsonSlurper.parseText(env['ROLE_OUTPUT'])

assert roleOutput instanceof Map

println("export AWS_ACCESS_KEY_ID=" + roleOutput.Credentials.AccessKeyId)
println("export AWS_SECRET_ACCESS_KEY=" + roleOutput.Credentials.SecretAccessKey)
println("export AWS_SESSION_TOKEN=" + roleOutput.Credentials.SessionToken)
