package math._2sum

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed {index, value ->
            if(map[value] != null) {
                return intArrayOf(map[value]!!, index)
            }
            val result: Int = target - value
            map.put(result, index)

        }

        return intArrayOf()
    }
}