// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    // Savings with 1.8% interest
    val account = SavingsAccount("Alice", 1.8)
    account.deposit(1250)
    repeat(5) {
        account.applyInterest()
    }
    account.withdraw(50)
    println("Final Balance: £${account.balance}")
}
