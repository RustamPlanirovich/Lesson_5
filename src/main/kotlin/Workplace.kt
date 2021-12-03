package functional

data class Emp(
    val name: String,
    val age: Int,
    val position: String
)

fun main() {
    val employees = listOf(
        Emp("Max Petrov", 22, "programmer"),
        Emp("Ivan Shapovalov", 33, "analyst"),
        Emp("Semen Deznev", 55, "manager"),
        Emp("Oleg Petrov", 19, "intern"),
        Emp("Katerina Drogova", 31, "programmer"),
        Emp("Nikolay Spivakov", 23, "analyst"),
        Emp("Boris Moiseev", 48, "manager"),
        Emp("Petr Sveshnikov", 37, "programmer"),
        Emp("Maria Kasatonova", 33, "analyst"),
        Emp("Olga Filimonova", 27, "programmer")
    )

    // самый молодой

    // количество программистов

    // распечатать все имена программистов

    // средний возраст

    // разделить на две группы - старше 40 и младше

    println(
        employees.minByOrNull { it.age }
    )
    println(
        employees.count { it.position == "programmer" }
    )
    println(
        employees.filter { it.position == "programmer" }.map { it.name.substringBefore(" ") }
    )
    println(
        employees.map { it.age.toFloat() }.average()
    )
    println(
        employees.groupBy { it.age > 40 }
    )
    println(
        employees.partition { it.age > 40 }.second.maxByOrNull { it.age }
    )
    println(
        employees.groupBy { it.position }.mapValues { it.value.count() }
    )
    println(
        employees.groupBy { it.age }.maxByOrNull { it.value.count() }
    )
    println(
        employees.flatMap { emp -> employees.map { it -> Pair(it, emp) } }.maxByOrNull { it.first.age - it.second.age }
    )


}