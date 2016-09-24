package hackathon
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class HomeController {
    def rabbitEmailService
    def index() {
        render view:"home"
    }

    def sendmail(){
        Map<String,String> email=[:]
        email["email"]="anuj@nexthoughts.com"
        email["template"]="hi anuj"
        rabbitEmailService.sendRegistrationRabbit(email)
    }
}
