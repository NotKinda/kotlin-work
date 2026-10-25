// Task 7.7.1: statistics functions
package median

fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) {"Cannot compute median of an empty list"}

    val sorted = values.sorted()
    val size = sorted.size

    return if (size % 2 != 0) {
        sorted[size / 2]

    } else {
        (sorted[size / 2 - 1]) + sorted[size / 2] / 2.0f
    }
}