// Task 7.7.1: data handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String): List<Float> = buildList {
    Path(filename).forEachLine { line ->
        add(line.toFloat())
    }
}