class BootStrap {

    def bootstrapService
    def init = { servletContext ->
        bootstrapService.createRoles()
        bootstrapService.createAdmin()
        bootstrapService.createUser()
        bootstrapService.createMilestones()
        bootstrapService.createLabels()
        bootstrapService.createStatus()
    }
    def destroy = {
    }
}
