package com.example.myapp

fun withoutParameter() {
    println("=== withoutParameter ===")
    println("Hello,World!")
}

fun withParameter(name: String) {
    println()
    println("=== withParameter ===")
    println("Hello, $name!")
}

//named argument adalah cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name!, You are $age years old.")
}

//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String= " Indra", age: Int) {
    println()
    println("=== withDefaultParameter ===")
    println("Hello,$name! You are $age years old.")
}
