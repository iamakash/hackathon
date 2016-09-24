class BootStrap {

    def bootstrapService
    def init = { servletContext ->
        bootstrapService.createRoles()
        bootstrapService.createAdmin()
        bootstrapService.createUser()
    }
    def destroy = {
    }
}
