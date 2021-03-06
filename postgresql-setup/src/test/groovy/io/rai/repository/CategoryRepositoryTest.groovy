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
        def name = "books"
        def c = new Category(name: name)

        when:
        Category savedCategory = cr.save(c)

        then:
        savedCategory != null
        savedCategory.id > 0
        savedCategory.name == name
    }

    def "test 2 : update Category name"() {
        given:
        def id = 21
        def name = "computer"

        when:
        def c = cr.findOne(id)
        c.setName(name)
        cr.save(c)

        then:
        true
    }

    def "test 3 : delete Category by id"() {
        given:
        def id = 37

        when:
        cr.delete(id)

        then:
        true
    }

    def "test 4 : query Category by id"() {
        given:
        def id = 12

        when:
        def c = cr.findOne(id)

        then:
        c != null
        c.id == id
        println(c.createdAt)
        println(c.lastModifiedAt)
    }
}
