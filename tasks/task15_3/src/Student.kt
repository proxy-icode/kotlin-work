// Task 15.3: Student class, demonstrating method overriding

class Student(name: String, val studentId: String) : Person(name) {
    override fun display() {
        println("Name: $name, Student ID: $studentId")
    }
}