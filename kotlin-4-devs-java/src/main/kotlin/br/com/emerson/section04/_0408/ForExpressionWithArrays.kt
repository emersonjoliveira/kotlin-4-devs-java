package br.com.emerson.section04._0408

fun main() {
    println()
    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index}) $item, ")
    }
    println()

    println()
    for ((idx, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${idx + 1}) $item, ")
    }
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()
}