package Easy

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
class RunningSumIn1dArray {
    companion object {
        fun runningSum(nums : IntArray) : IntArray {
            val newArray = IntArray(nums.size)
            for(i in nums.indices){
                var count = 0
                for(j in 0..i){
                    count += nums[j]
                    println(count)
                }
                newArray[i] = count
            }
            return newArray
        }
    }

}