package com.my_java_app

import spock.lang.Specification

class JavaHelloSpecTest extends Specification {
    def "GetHello"() {
        when:
        def foo = "123"

        then:
        true
    }
}
