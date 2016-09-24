package com.backend

enum IssueHistoryType {

    After('After'),
    Before('Before')

    IssueHistoryType(value) {
        this.value = value
    }

    private final String value

    String getKey() {
        name()
    }

    String toString() {
        value
    }

}