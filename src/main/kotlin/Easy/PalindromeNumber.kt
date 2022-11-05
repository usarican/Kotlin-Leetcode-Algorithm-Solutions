package Easy

class PalindromeNumber {
    companion object {
        fun isPalindrome(x : Int) : Boolean {
            val reelNumber = x.toString()
            val reversedNumber = reelNumber.reversed()

            return reelNumber == reversedNumber
        }
    }

}