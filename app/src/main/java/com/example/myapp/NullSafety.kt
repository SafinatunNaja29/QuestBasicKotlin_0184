package com.example.myapp

import org.jetbrains.annotations.NotNull

fun NullSafety() {
    var neverNull: String = "This can't be null"

    //Nullable has nullable string type
    var nullable: String? = "You can a null here"
    nullable = null

    //Check for null in conditions
    if(neverNull == null) {
        println("inferredNonNull is Null")
    } else {
        println("inferredNonNull is not Null")
    }

    //Safe all operator
    println(neverNull.length) //mencetak argumen
    println(nullable?.length) //null

    //notNull doesn't accept null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() { //fun untuk deklarasi fungsi & main() tempat program dimulai
    NullSafety()
}