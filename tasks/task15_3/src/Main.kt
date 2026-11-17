// Task 15.3: program demonstrating dynamic binding
fun main() {
    val person = Person("Grace Blackwell")
    val student = Student("Vera Rubin", "RTX5090")

    person.display()
    student.display()
}