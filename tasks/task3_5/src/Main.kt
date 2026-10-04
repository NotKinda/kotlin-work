// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val filePath = Path("test.txt")
    filePath.writeText("Hello this is test text")
    filePath.appendText("\nHello this next text should replace the previous")
    val fileContents = filePath.readText()
    with(System.out) {
        printf("The contents of the file contain: ${fileContents}")
    }
}
