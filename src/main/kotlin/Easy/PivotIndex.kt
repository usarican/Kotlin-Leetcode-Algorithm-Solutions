package Easy

class PivotIndex {
    companion object {
        fun pivotIndex(nums: IntArray): Int {
            var sum = 0
            var leftSum = 0
            for (i in nums.indices) sum += nums[i]
            for(i in nums.indices){
                if(leftSum == sum - leftSum - nums[i] ) return i
                leftSum += nums[i]
            }
            return -1
        }
    }
}