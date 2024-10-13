package com.example.myapp

//List adalah kumpulan data yang disusun secara berurutan dari

fun ContohList() {
    println("=== List ===")
    //List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val mutableShapes: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(mutableShapes)

    //Menambahkan data kedalam List Mutable
    mutableShapes.add("Circle")
    println(mutableShapes)

    //Menghapus data dari List Mutable
    mutableShapes.remove("Triangle")
    println(mutableShapes)

    //Mengubah data didalam List Mutable
    mutableShapes[0] = "Oval"
    println(mutableShapes)

    //List Read-Only
    val shapeLocked: List<String> = mutableShapes
    println(shapeLocked)
}
