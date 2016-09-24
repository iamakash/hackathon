dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
    generate_statistics = true
}

// environment specific settings
environments {
    development {
        dataSource {
            logSql = false
            username = "root"
            password = "nextdefault"
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/issue"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            properties {
                maxActive = 50
                maxIdle = 25
                minIdle = 5
                initialSize = 5
                minEvictableIdleTimeMillis = 60000
                timeBetweenEvictionRunsMillis = 60000
                maxWait = 10000
                validationQuery = "/* ping */"
            }
        }
    }
    test {
        dataSource {
            driverClassName = "org.h2.Driver"
            dbCreate = "update"
            // GORM (hibernate) is trying to drop tables in the H2 DB that have never been created in create-drop resulting in exception, DB is created new each time you run the test-app on the fly
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {
            logSql = false
            username = "root"
            password = "nextdefault"
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/issue"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            properties {
                maxActive = 50
                maxIdle = 25
                minIdle = 5
                initialSize = 5
                minEvictableIdleTimeMillis = 60000
                timeBetweenEvictionRunsMillis = 60000
                maxWait = 10000
                validationQuery = "/* ping */"
                maxAge = 180000
                testOnBorrow = true
                testWhileIdle = true
                validationInterval = 0
            }
        }
    }
}