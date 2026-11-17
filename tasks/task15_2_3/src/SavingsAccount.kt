// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    fun applyInterest() {
        val interest = (balance * (rate / 100.0)).toInt()
        deposit(interest)
    }
}