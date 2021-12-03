package lambda

import java.util.*

data class Person(val name: String, val age: Int)

val list = listOf(1, 2, 3, 4, 5, 6, 7, 2, 3, 4)

val people = listOf(
    Person("Elise", 29),
    Person("Bob", 31),
    Person("Carol", 31)
)
val nullableList: List<Int?> = listOf(1, 2, 3, null, 6, 8)

val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")


val listOflist = listOf(
    listOf("abc", "kgb", "cia"),
    listOf("ibm", "kpmg")
)

fun main() {
    println(

//        people.zip(list)
//        listOflist.flatten().map { it.toList() }
//        listOflist.flatten().flatMap { it.toList() }
//        listOflist.flatten()
//        people.partition { it.age > 30 }
//        people.associateBy { it.age }
//         people.groupBy { it.age }
//        list.reduce { acc, i -> acc * i }
//        list.fold(list.first()) { acc: Int, elev: Int -> acc * elev }
//        people.sumOf<Person> { it.age }
//        people.map { it -> it.age }.sum()
//        people.map { it -> it.age.toFloat() }.average()
//        people.find { it.age == 31 && it.name.contains('o') }
//        people.count { it.age == 30 }
//        people.all { it.age != 3 }
//        people.none { it.age == 31 }
//        people.any { it.age == 29 }
//        map.mapValues { it.value.uppercase(Locale.getDefault()) }
//        list.filter { it % 3 == 0 }.map { it * it }
//        people.filter { it.age > 30 }.map { it.name }
//        list.distinctBy { it % 3 == 0 }
//        people.maxByOrNull { it.age }?.age
//        list.filter { it % 3 == 0 }
//        nullableList.filter { it != null &&  it % 3 == 0 }
    )
//    println(
////        people.filter { it.age > 30 }
//    )

//    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
//    val some: () -> Unit = { println("hello") }
//    val result = sum(1, 2)
//
}