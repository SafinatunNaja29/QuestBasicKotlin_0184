package com.example.myapp

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "Mary@gmail.com")

    //Print the value of the property: email
    println(contact.email)

    //Update the value of the property: email
    contact.email = "jane@gmail.com"

    //Prints the new value of the property: email
    println(contact.email)
}