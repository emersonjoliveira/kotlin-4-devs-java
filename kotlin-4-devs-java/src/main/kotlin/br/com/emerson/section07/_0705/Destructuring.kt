package br.com.emerson.section07._0705

import br.com.emerson.section07._0702.Coordinates

fun main() {
    showComponents()

    println()
    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(300, 200)
    val c3 = c1 + c2
    println(c3)

    val (xCoordinate, yCoordinate) = c3
    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("yCoordinate = ${c2.component2()}")
}

fun showComponents() {
    val myPoint = Point(5, 15, 60)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}