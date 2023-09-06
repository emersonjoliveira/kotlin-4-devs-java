package br.com.emerson.section07._0704

fun main() {
    val person = Person("Stan", "Lee")
    val kClass = person::class
    println("Simple name = $kClass")
    println("Simple name = ${kClass.simpleName}")
    println()

    kClass.members.forEach {
        println("Property name $it")
    }

    println()
    kClass.java.declaredFields.forEach {
        println("Property name ${it.name}")
    }

    println()
    for (constructor in kClass.constructors) {
        println("Constructor $constructor")
        println("Constructor return ${constructor.returnType}")
        println("Constructor parameters ${constructor.parameters}")
    }
}