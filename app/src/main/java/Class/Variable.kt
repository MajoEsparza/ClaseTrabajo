//package com.example.clasetrabajo.class

//class Variable {
//}

fun main(){
    //Numeric variables
    val age:Int = 21
    val long_number:Long = 3437823872377777777
    val temperature:Float = 27.44444f
    val weight:Double = 23.44444444

    //String variables

    val gender:Char = 'F'
    val name:String = "Marijo Ruiz"

    //bool variables

    val isGreater = false
    //otra forma
    val isG:Boolean = true

    //Collection variables

    val names = arrayOf("Marijo", "Mariana", "Sharon", "Karime")
    println(age)

    println("Welcome $name, to your first Kotlin project?")
    print(add())
    print(product(x=5, y=0))
    printArray(names)


}
    fun add(): Int{
        val x = 10
        val y = 5
        println(x+y)
        return (x + y)
    }

     fun product (x:Int, y: Int): Int{
         return (x + y)

}

fun printArray(names:Array<String>) {
    println(names)
    for (name in names) {
        println("hello $name")
    }

}


