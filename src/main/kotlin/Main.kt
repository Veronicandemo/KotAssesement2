fun main() {
    println(checkPword("a love Kotlin"))
    var account = CurrentAccount("1234-3456-5678-7689", "Veronica", 12000.00)
    account.details()
    multipleOf6And8()
    println(pwordConfirmer("vee123ert"))


}
//    1. Write and invoke one function that takes in a random string and returns the
//            following values: first character, last character, length of the string and
//    whether it begins with a vowel or not. (6pts)
data class Holder(var first: Char, var last: Char, var length: Int, var vowel: Array<String>)
fun checkPword(randStr: String): Holder{
    var first = randStr[0]
    var last = randStr[randStr.length -1]
    var length = randStr.length
    var vowels = arrayOf("a", "b", "c", "d")
    for (vowel in  vowels)
    {
        if (randStr.startsWith(vowel)){
            println("sarts with a vowel")
        }
        else println("Random string does not start with a vowel")
    }
    return Holder(first,last,length,vowels)
}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun pwordConfirmer(password: String): Boolean {
    if (password.length < 8) {
        return false
    }
    if (password.length > 16) {
        return false
    }
    if (password == "password") {
        return false
    }
//    if(password.contains()){
//        return
//    }
    return true
}


//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multipleOf6And8() {
    for (num in 1..1000) {
        if (num % 48 == 0) {
            println("Bingo!")
        } else if (num % 6 == 0) {
            println("$num")
        } else if (num % 8 == 0) {
            println("$num")
        }
    }
}

//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Double){
    var total:Double = 0.0
    open fun deposit(amount: Double): Double{
        total = balance + amount
        return total
    }
    fun withdraw(amount: Double): Double{
        total = balance - amount
        return  total
    }
    open fun details(){
        println("Account Number $accountNumber with balance $balance is operated by $accountName")
    }
    }
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(accountNumber: String,accountName: String, balance: Double, var withdrawal: Int): CurrentAccount(accountNumber,accountName,balance){
//    fun withdrawal(withdrawals: Int){
//        if(withdrawals< 4){
//            balance
//           var  withdrawal =  withdrawals
//        }
//    }
}














