package com.backend


class UserTeam implements Serializable {

    private static final long serialVersionUID = 1

    User user
    Team team

    static UserTeam create(User user, Team team, boolean flush = false) {
        def instance = new UserTeam(user: user, team: team)
        instance.save(flush: flush, insert: true)
        instance
    }

    static mapping = {
        id composite: ['user', 'team']
        version false
    }
}
