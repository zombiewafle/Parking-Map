/*
Universidad del Valle De Guatemala
Autor: Javier Salazar Carné: 18764
Fecha: 09/08/18
Descripcion: Programa, que muestra o simula a un parqueo, permitiendo elegir lugar, dependiendo de si ya esta ocupado
o no, se mostraran una X  cuando ya este ocupado. Se puede ingresar como un admin o como un usuario, si se es admin,
mostrara un menu, y si se es usuario, se mostrara otro, cada uno con sus respectivas funciones.

*/

import uvg.Map.Parking.ParkingMap
import uvg.Map.Parking.Levels
import uvg.Map.Parking.Walls

import java.io.FileNotFoundException
import java.io.File
import java.util.*
import java.util.ArrayList
import java.util.logging.Level

val opcionMenu2 = 0
val opcionMenu3 = 0
val opcionMenu = 0

fun readMap (link:String): ArrayList<Array<String>> {
    val Map = ArrayList<Array<String>>()
    try {
        val scan = Scanner(File(link))
        while (scan.hasNextLine()) {
            val line = scan.nextLine()
            Map.add(line.trim({ it <= ' ' }).split("".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray())
        }
    }catch (ex: FileNotFoundException) {
    }
    return Map
}

fun main(args: Array<String>){
        println("----------------------------------------------")
        println("Welcome to the Parking!!")
        println("----------------------------------------------")
        println("Enter your name here  >>")
        val stringInput = readLine()!!
        println("Welcome: $stringInput")
        println("What do you want to do? $stringInput")
        println("----------------------------------------------")
        println("We have the next options....")
        println("----------------------------------------------")

    fun menu(args: Array<String>){
        while (opcionMenu !=9)
        println("Seleccione una opcion>>:")
        println("\t1 - Administrator")
        println("\t2 - User")
        println("\t3 - Exit")
    }
    while (opcionMenu == 0) {
        println("----------------------------------------------")
        println("Enter a value >>>")
        val opcionMenu = readLine()!!

        if (opcionMenu == "1") {
            println("----------------------------------------------")
            println("You are an Admin, welcome!!")
            println("----------------------------------------------")
            while (opcionMenu2 != 4) {
                println("\t1 - New Level")
                println("\t2 - Erase Level")
                println("\t3 - See All The Levels")
                println("\t4 - Exit")

                while (opcionMenu2 == 0){
                    println("----------------------------------------------")
                    println("Enter a value >>>")
                    val opcionMenu2 = readLine()

                    if (opcionMenu2 =="1"){
                        println("----------------------------------------------")
                        val Map01 = readLine()
                        println("A level has created ")

                        println("----------------------------------------------")
                    }
                    if (opcionMenu2 == "2"){
                        println("----------------------------------------------")
                        println("A level has erased")
                        println("----------------------------------------------")
                    }
                    if (opcionMenu2 == "3"){
                        println("-------------------------------------------------")
                        println("This is the list of all the levels on the parking")
                        println("-------------------------------------------------")
                    }
                    if (opcionMenu2 == "4"){
                        println("----------------------------------------------")
                        println("Come Back Soon!!")
                        println("----------------------------------------------")
                    }
                }
            }

        if (opcionMenu == "2"){
            println("----------------------------------------------")
            println("You are a User, welcome!!")
            println("----------------------------------------------")
            break
        }
        if (opcionMenu == "3") {
            println("----------------------------------------------")
            println("Come Back Soon!!")
            println("----------------------------------------------")
            break
        }
    }

}

    while (opcionMenu3 != 2) {
        println("----------------------------------------------")
        println("\t1 - Enter a Car Plate")
        println("\t2 - Exit")
        println("----------------------------------------------")
    }
}