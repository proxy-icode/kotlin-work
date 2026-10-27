// Stats

fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) {
        "Cannot calculate median of an empty list"
    }

    val sorted = values.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted [middle - 1] + sorted[middle]) / 2f
    } else {
        sorted[middle]
    }
}

fun displayStats(values: List<Float>) {
    require(values.isNotEmpty()) {
        "Dataset cannot be empty"
    }

    println("Minimum: ${values.min()}")
    println("Maximum: ${values.max()}")
    println("Mean: ${values.average()}")
    println("Median: ${median(values)}")
}
