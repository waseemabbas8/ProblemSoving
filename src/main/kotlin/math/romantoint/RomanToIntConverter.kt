package math.romantoint

class RomanToIntConverter {
    fun romanToInt(s: String): Int {
        val symbolsValues = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var number = 0

        for(i in s.indices) {
            val nextIndex = i+1
            val c = s[i]
            val currentValue = symbolsValues.getValue(c)
            val value: Int = if(nextIndex < s.length) {
                val nextValue = symbolsValues.getValue(s[nextIndex])
                if(nextValue > currentValue) {
                    -1 * currentValue
                } else {
                    currentValue
                }
            } else {
                currentValue
            }
            number += value
        }

        return number
    }
}