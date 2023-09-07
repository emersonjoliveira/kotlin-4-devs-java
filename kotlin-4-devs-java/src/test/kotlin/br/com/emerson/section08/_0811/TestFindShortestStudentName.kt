package br.com.emerson._0811

import br.com.emerson.section8._0811.Student
import br.com.emerson.section8._0811.findTheShortestStudentName
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun `Find shortest student name should be equal 'Ada'`() {

        val students = listOf(
            Student("Ada", 19),
            Student("Manoel", 23),
            Student("Maria", 20),
            Student("João", 39),
            Student("José", 16)
        )
        findTheShortestStudentName(students)?.name shouldBeEqualTo "Ada"
    }
}