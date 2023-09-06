package br.com.emerson.section06._0602

import br.com.emerson.section06._0602.Animal

fun main() {

    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())

    val dog = Animal("Caramelo", "dog", 30)
    println(dog.show())

    cat.weight = 13
    println(cat.show())
}