package br.com.emerson.section04._0405

fun main() {
    val myInt = 199
    val anInt: Int = 7

//    int lowest = myInt < aInt ? myInt : aInt;
    val lowest = if (myInt < anInt) myInt else anInt

    val temp = 25
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")
}