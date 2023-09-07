package br.com.emerson.section8._0803

fun main() {
    val studens = getStudents()
    val combos = studens.map { student -> "${student.name} : ${student.age}" }
    println("Combos: $combos")
    println("The oldest student is: ${studens.maxByOrNull { it.age }}")
    println("Students with longest name are: ${studens.filter { it.name.length > 4 }}")
}