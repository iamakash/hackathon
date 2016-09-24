package com.backend

import com.backend.util.command.DefaultMilestoneCO

class DefaultMilestoneService {

    static transactional = false

    DefaultMilestone create(DefaultMilestoneCO defaultMilestoneCO) {
        DefaultMilestone defaultMilestone = new DefaultMilestone(defaultMilestoneCO)
        defaultMilestone.save(flush: true)
    }

    void delete(Integer id) {
        DefaultMilestone defaultMilestone = DefaultMilestone.findById(id)
        defaultMilestone.delete()
    }
}
