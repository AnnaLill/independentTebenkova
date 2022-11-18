package com.example.independenttebenkova.torun
import com.example.independenttebenkova.model.Carnivorous
import com.example.independenttebenkova.model.Herbivorous
fun main(){
    val Carnivorous1 = Carnivorous("tiger", "meat")
    val carnivorous2= Carnivorous ("wolf", "meat")
    println(Carnivorous1.food)
    Carnivorous1.food = "meat"
    println(Carnivorous1.food)
    println(Carnivorous1.age)
  Carnivorous1.age = 2
    val animals1 = Herbivorous (tittle = "giraffe", food = "herb", color = true)
    val animals2 = Herbivorous (tittle = "monkey", food = "herb", color = false)
    val herbivorous1 = Herbivorous("giraffe", "herb")
    val herbivorous2= Herbivorous ("monkey", "herb")
    println(herbivorous1.food)
    herbivorous1.food = "herb"
    println(herbivorous1.food)
    println(herbivorous1.age)
    herbivorous1.age = 2
}