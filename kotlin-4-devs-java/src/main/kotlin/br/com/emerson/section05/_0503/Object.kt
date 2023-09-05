package br.com.emerson.section05._0503

fun main() {
    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }
    println("Cordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() {
            println("Cordinates = ($xCoordinate, $yCoordinate)")
        }
    }
    location2.printIt()

    location2.xCoordinate = 400
    location2.yCoordinate = 800

    location2.printIt()

    val temperature = MySingleton.getLastTemperatures()
    println("Last temperature measured = $temperature degrees!")
}

object MySingleton {
    private var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperatures() = temperatures.last()
}