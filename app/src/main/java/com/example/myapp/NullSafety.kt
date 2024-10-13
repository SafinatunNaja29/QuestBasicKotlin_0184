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


}