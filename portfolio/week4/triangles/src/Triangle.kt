// COMP2850 Portfolio: Week 4
// Triangle class
// Name: Thant Thurain
// ID: 201994075

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA.isFinite() && sideB.isFinite() && sideC.isFinite() &&
            sideA > 0.0 && sideB > 0.0 && sideC > 0.0 &&
            sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            "Invalid triangle: the sides cannot form a triangle"
        }
    }

    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2.0
    val area: Double
        get() {
            val s = semiPerimeter
            return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}
