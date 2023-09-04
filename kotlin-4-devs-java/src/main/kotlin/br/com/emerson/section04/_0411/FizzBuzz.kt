package br.com.erudio._0411

fun main() {
    println(fizzBuzz(16))
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()
    for (it in 1.rangeTo(n)) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

fun fizzBuzz1(n: Int): List<String> {
    val list = mutableListOf<String>()
    (1.rangeTo(n)).forEach() {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

