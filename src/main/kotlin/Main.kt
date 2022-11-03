import TwoSumProblem.Companion.twoSum

fun main(args: Array<String>) {
    val nums = intArrayOf(3,2,4)
    val target = 6
    val s = "MCM"

    println(RomanToInteger.romanToInt(s))

    println(twoSum(nums,target)?.toList())
    println(PalindromeNumber.isPalindrome(121))
}