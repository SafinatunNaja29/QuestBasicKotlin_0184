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

    //Mengubah data di dalam List Mutable
    mutableShapes[0] = "Oval"
    println(mutableShapes)

    //List Read-Only
    val shapeLocked: List<String> = mutableShapes
    println(shapeLocked)
}

fun ContohSet(){
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val mutableShapes: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(mutableShapes)

    //Menambahkan data kedalam Set Mutable
    mutableShapes.add("Rectangle")
    println(mutableShapes)

    //Set Read-Only
    val shapeLocked: Set<String> = mutableShapes
    println(shapeLocked)
}

fun ContopMap() {
    println()
    println("=== Map ===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val mutableShapes: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(mutableShapes)

    //Menambahkan data kedalam Map Mutable
    mutableShapes["Rectangle"] = 4
    println(mutableShapes)

    //Menghapus data dari Map Mutable
    mutableShapes.remove("Circle")
    println(mutableShapes)

    //Mengubah data didalam Map Mutable
    mutableShapes["Square"] = 5
    println(mutableShapes)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = mutableShapes
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContopMap()
}
