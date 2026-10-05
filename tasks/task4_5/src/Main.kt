// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: 1 argument required (loopLimit)")
        exitProcess(1)
    }

    val loopLimit = args[0].toInt()

    var sum = 0L

    for (i in 1..loopLimit step 2){
        sum += i
    }

    println(sum)
}
