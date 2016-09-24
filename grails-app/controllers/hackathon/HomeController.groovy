package hackathon

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class HomeController {
    def index() {
        println "mmmmmmmmmmmmmmmmmmmmm"
        render view: "home"
    }

    def sendmail() {
        println("sending.........")
        sendMail {
            to "anuj@nexthoughts.com"
            subject "Hello John"
            html g.render(template: "/templates/email")
        }
        println("sending success.........")

    }
}
