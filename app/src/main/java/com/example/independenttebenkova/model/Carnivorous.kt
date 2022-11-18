package com.example.independenttebenkova.model

 class Carnivorous(var tittle:String, var food :String) {
    constructor ( tittle: String, food: String,  color:Boolean):this(tittle, food){

    }

   val  color:Boolean = true // true - stripy
    var age:Int=0

    init {
       println("Мы создали $tittle")
        var color:Boolean = true

    }
}