package com.backend

import grails.transaction.Transactional

@Transactional
class IssueService {

    def save(Issue issue) {
        issue.save()
    }

    def update(Issue issue) {
        issue.save()
    }

    def delete(Issue issue) {
        issue.delete()
    }
}
