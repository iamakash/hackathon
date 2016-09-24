package com.backend.util

import com.backend.User
import com.xlson.groovycsv.CsvParser
import grails.util.GrailsUtil


class AppUtil {
    public static String getStaticResourcesDirPath() {
        String path = '';
        if (GrailsUtil.developmentEnv) {
            path = '/home/abhinav/Downloads'
        } else {
            path = '/home/ubuntu/var'
        }
        return path
    }

    public static def readCsvFile() {
        String path = getStaticResourcesDirPath() + "/authors.csv"
        File file = new File(path)
        if (!file.exists()) {
            return
        }
        BufferedReader br = null
        br = new BufferedReader(new FileReader(file))
        def csvData = CsvParser.parseCsv(br)
        return csvData
    }

    public static Boolean isRelaventArticle(String title, String description) {
        Boolean isRelavantArticle = Boolean.FALSE
        List<String> keywords = ["foodpanda", "zomato", "tinyowl", "swiggy", "yumist"]
        for (String keyword : keywords) {
            if (title.toLowerCase().find(keyword) || description.toLowerCase().find(keyword)) {
                isRelavantArticle = Boolean.TRUE
                break
            }
        }
        isRelavantArticle
    }

    public static User getARandomUser() {
        List<User> users = User.list()
        Random randomGenerator = new Random()
        int index = randomGenerator.nextInt(users.size())
        User user = users.get(index)
        user
    }
}
