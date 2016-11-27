package io.rai.repository

import io.rai.Application
import io.rai.entity.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification

@WebAppConfiguration
@ContextConfiguration(classes = Application.class, loader = SpringBootContextLoader.class)
class CategoryRepositoryTest extends Specification {

    @Autowired
    private CategoryRepository cr

    def "test 1 : add Category"() {
        given:

        when:

        then:
        true
    }

    def "test 2 : update Category name"() {
        given:

        when:

        then:
        true
    }

    def "test 3 : delete Category by id"() {
        given:

        when:

        then:
        true
    }

    def "test 4 : query Category by id"() {
        given:

        when:

        then:
        true
    }
}
