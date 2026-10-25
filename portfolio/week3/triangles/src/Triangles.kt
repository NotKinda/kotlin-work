// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(t: Triangle): Boolean {
    val (a, b, c) = t
    return (a < b + c)&& (b < a + c) && (c < a + b)
}

fun triangleArea(t: Triangle): Double {
    require(isValidTriangle(t)) {"Invalid triangle side lengths"}

    val (a, b, c) = t
    val s = (a + b + c) / 2.0
    return sqrt(s * (s - a) * (s - b) * (s - c))
}
