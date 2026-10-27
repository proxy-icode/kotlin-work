// COMP2850 Portfolio: Week 3 (edited from Week 2)
// Functions for working with triangle geometry
// Name: Thant Thurain
// ID: 201994075

import kotlin.math.sqrt

typealias Triangle = Triple<Double, Double, Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    return a < b + c && b < a + c && c < a + b
}

fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)) {
        "Invalid triangle: the sides cannot form a triangle"
    }

    val (a, b, c) = triangle
    val s = (a + b + c) / 2.0
    return sqrt(s * (s - a) * (s - b) * (s - c))
}