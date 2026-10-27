import kotlin.system.exitProcess

// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("a) Mozzarella")
    println("b) Asiago")
    println("c) Romano")
    println("d) Provolone")

    print("Enter your choice: ")
    val choice = readln().lowercase()
    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice")
    }
}
