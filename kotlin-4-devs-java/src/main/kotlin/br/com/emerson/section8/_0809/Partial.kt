package br.com.emerson.section8._0809

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {
    val preFixAndPostFix: (String, String, String) -> String = {
        prefix: String, x: String, postFix: String -> "$prefix $x $postFix"
    }
    val preFixAndAlert: (String, String) -> String = preFixAndPostFix.partially3("!")
    val hello: (String) -> String = preFixAndAlert.partially1("Hello, ")
    println(hello("FunkTionale"))
}