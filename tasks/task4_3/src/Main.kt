// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: need 3 integer marks")
        exitProcess(1)
    }
    
    val mark1 = args[0].toDouble()
    val mark2 = args[1].toDouble()
    val mark3 = args[2].toDouble()

    val average = (mark1+mark2+mark3) / 3.0

    val grade = when (average.toInt()) {
        in 0..39   ->  "fail"
        in 40..69  ->  "pass"
        in 70..100 ->  "distinction"
        else       ->  "?"
    }

    println("Average mark: %.3f".format(average))
    println("Grade: $grade")
}