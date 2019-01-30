fun main(args: Array<String>) {
    var beverage = readLine()
    beverage?.let {
        beverage = it.capitalize()
    } ?: println("I can't do without crashing - beverage was null!")
    println(beverage)
}