package br.com.emerson.section04._0406

fun main() {
    val pizzasOrdered = -1

    when (pizzasOrdered) {
        0 -> println("I'm not hungry")
        1 -> println("I'm hungry")
        2 -> println("I'm very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("I'm not hungry")
        1, 2 -> println("I'm hungry")
        3 -> println("I'm very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }
}