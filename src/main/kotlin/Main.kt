import Easy.PalindromeNumber
import Easy.PivotIndex
import Easy.RomanToInteger
import Easy.RunningSumIn1dArray
import Easy.TwoSumProblem.Companion.twoSum

fun main(args: Array<String>) {
    val nums = intArrayOf(2,1,-1)
    val target = 6
    val s = "MCM"

    //println(RomanToInteger.romanToInt(s))
    //println(twoSum(nums,target)?.toList())
    //println(PalindromeNumber.isPalindrome(121))
    //println(RunningSumIn1dArray.runningSum(nums).toList())
    println(PivotIndex.pivotIndex(nums))
}