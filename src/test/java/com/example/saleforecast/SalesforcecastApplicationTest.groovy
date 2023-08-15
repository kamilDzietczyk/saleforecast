package com.example.saleforecast

import org.springframework.boot.SpringApplication
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SalesforcecastApplicationTest extends Specification {

    def "context loads"() {
        given:
        def application = new SaleforecastApplication()

        when:
        def context = SpringApplication.run(application, [])

        then:
        context != null
    }
}
