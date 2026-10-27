// Task 7.7.1: program to compute stats for a numeric dataset

fun main(args: Array<String>) {
    require(args.size == 1) {
        "Usage: provide a data filename"
    }

    val values = readData(args[0])
    displayStats(values)
}