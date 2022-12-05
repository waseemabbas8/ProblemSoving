package math._3sum

class ZeroSumTriplets {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val triplets = mutableListOf<List<Int>>()

        //1. create lists of negative, positives and zeros.

        val n: MutableList<Int> = mutableListOf()
        val p: MutableList<Int> = mutableListOf()
        val z: MutableList<Int> = mutableListOf()
        nums.forEach {
            when {
                it < 0 -> n.add(it)
                it > 0 -> p.add(it)
                else -> z.add(it)
            }
        }

        //2. create set for positive and negatives
        val nSet = n.toSet()
        val pSet = p.toSet()

        //3. If there is at least 1 zero in the list, add all cases where -num exists in N and num exists in P
        if (z.isNotEmpty()) {
            for (num in pSet) {
                if (nSet.contains(-1 * num)) {
                    triplets.add(listOf(-1 * num, 0, num))
                }
            }
        }

        //4. If there are at least 3 zeros in the list then also include (0, 0, 0) = 0
        if (z.size >= 3) {
            triplets.add(listOf(0, 0, 0))
        }

        //5. For all pairs of negative numbers (-3, -1), check to see if their complement (4)
        for (i in n.indices) {
            for (j in i + 1..n.lastIndex) {
                val target = -1 * (n[i] + n[j])
                if (pSet.contains(target)) {
                    triplets.add(listOf(n[i], n[j], target).sorted())
                }
            }
        }

        //6. For all pairs of positive numbers (1, 1), check to see if their complement (-2)
        for (i in p.indices) {
            for (j in i + 1..p.lastIndex) {
                val target = -1 * (p[i] + p[j])
                if (nSet.contains(target)) {
                    triplets.add(listOf(p[i], p[j], target).sorted())
                }
            }
        }

        return triplets.toSet().toList()
    }
}