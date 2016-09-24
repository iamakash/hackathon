class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")
        "/"(controller: "login", action: "auth")
        "/${name}"(controller: "project", action: "projectDetail")
        "500"(view: '/error')
    }
}
