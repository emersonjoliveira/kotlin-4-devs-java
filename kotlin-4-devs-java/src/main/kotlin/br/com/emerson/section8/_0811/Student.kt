package br.com.emerson.section8._0811

data class Student(val name: String, var age: Int)

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}