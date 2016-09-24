package hackathon
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class HomeController {
    def index() {
        render view:"home"
    }

    def sendmail(){
        sendMail {
            to "anuj@nexthoughts.com"
            subject "Hello John"
            html g.render(template:"/templates/email")
        }
    }
}
