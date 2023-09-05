package br.com.emerson.section05._0505

fun main() {
    val maxInt: Int = max(42, 26)
    val maxLong: Long = max(123_456_789L, 999_999_999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alpha", "Omega")

    println("The max int = $maxInt")
    println("The max long = $maxLong")
    println("The max byte = $maxByte")
    println("The max string = $maxString")
}