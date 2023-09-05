package br.com.emerson.section05._0504

interface Vehicle {
    val autmakerName: String

    fun start() {
        println("Vruuuum")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}