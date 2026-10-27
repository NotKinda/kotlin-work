// Task 5.1.2: main program
import kotlin.random.Random

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: Please specify the number of sides for the die.")
        return
    }

    val sides = args[0].toIntOrNull()

    if (sides == null || sides < 1) {
        println("Error: Please provide a valid positive integer for sides.")
        return
    }

    val result = rollDie(sides)
    println("Rolled a $sides-sided die: $result")
}