package hackathon
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class HomeController {
    def index() {
        println "mmmmmmmmmmmmmmmmmmmmm"
        render view:"home"
    }

    def sendmail(){
println("sending.........")
        sendMail {
            to "anuj@nexthoughts.com"
            subject "Hello Anuj"
            html "max is success"
        }
        println("sending success.........")

    }
}
