// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: 1 argument required (file path)")
        exitProcess(1)
    }

    val filePath = Path(args[0])

    var currentLineNum = 1
    var longestLineNum = 1
    var maxLength = -1

    filePath.forEachLine { line ->
        if (line.length > maxLength) {
            maxLength = line.length
            longestLineNum = currentLineNum
        }
    }
    println("Line $longestLineNum is the longest (length = $maxLength)")
}