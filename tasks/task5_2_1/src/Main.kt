// Task 5.2.1: main program

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: Please provide a circle radius.")
        return
    }

    val radius = args[0].toDoubleOrNull()

    if (radius == null || radius < 0) {
        println("Error: Please provide a valid non-negative radius.")
        return
    }

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Radius: $radius")
    println("Area: %.4f".format(area))
    println("Perimeter: %.4f".format(perimeter))
}