package com.backend

import grails.gorm.DetachedCriteria
import org.apache.commons.lang.builder.HashCodeBuilder

class UserGroup implements Serializable {

    private static final long serialVersionUID = 1

    User user
    Group group


    static UserGroup create(User user, Group group, boolean flush = false) {
        def instance = new UserGroup(user: user, group: group)
        instance.save(flush: flush, insert: true)
        instance
    }

    static mapping = {
        id composite: ['user', 'group']
        version false
    }
}
