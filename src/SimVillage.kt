fun main(args: Array<String>) {
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configurationGreetingFunction()
    println(greetingFunction(greetingFunction("Guyal")))
}

fun configurationGreetingFunction(): (String) -> String {
    val structType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("Adding $numBuildings $structType")
        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
    }
}

fun printConstructionCost(numBuidings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuidings}")
}