// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val file = Path("test.txt")
    file.writeText("Im a Im a")
    file.appendText(" one percent low battery girl")
    val message = file.readText()
    println(message)
}
