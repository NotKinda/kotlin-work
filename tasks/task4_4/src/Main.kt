// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: 3 arguments required (intiialTemp, maxTemp. tempInc)")
        exitProcess(1)
    }

    var initialTemp = args[0].toDouble()
    var tempMax = args[1].toDouble()
    var tempInc = args[2].toDouble()

    var currentTemp = initialTemp

    while (currentTemp <= tempMax) {
        val tempF = (currentTemp * 1.8) + 32.0
        println("%5.1f %6.1f".format(currentTemp, tempF))
        currentTemp += tempInc
    }
}
