package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(
    holder: String,
    overdraft: Int = 0
) : BankAccount(holder) {

    companion object {
        const val MAX_OVERDRAFT = 100
    }

    var overdraft: Int = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT) { "Overdraft must be between 0 and $MAX_OVERDRAFT" }
            field = value
        }

    init {
        this.overdraft = overdraft
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= -overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}