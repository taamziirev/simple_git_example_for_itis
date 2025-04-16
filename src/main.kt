fun main() {
    println("Привет, мир!")
    
    val calculator = Calculator()
    println("2 + 3 = ${calculator.add(2, 3)}")
    println("5 - 2 = ${calculator.subtract(5, 2)}")
    println("4 * 3 = ${calculator.multiply(4, 3)}")
}

class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
} 