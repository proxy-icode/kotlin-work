// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Exactly three marks required")
        exitProcess(1)
    } else {
        val mark1 = args[0].toDouble()
        val mark2 = args[1].toDouble()
        val mark3 = args[2].toDouble()

        val average = (mark1 + mark2 + mark3) / 3
        val roundedAverage = average.roundToInt()
        val grade = when (roundedAverage) {
            in 70..100 -> "Distinction"
            in 40..69 -> "Pass"
            in 0..39 -> "Fail"
            else -> "Invalid"
        }
        println(grade)
    }
}