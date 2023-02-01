package strings.changeword

class ChangeWordSolution {
    fun changeWord(str: String): String {

        val chars = str.toCharArray()

        val middleIndex = (str.length)/2

        for(i in 0..middleIndex) {
            val j = str.lastIndex - i

            if(i == j) {
                chars[i] = chars[i].makeUpperCase()
            } else {
                chars[i] = chars[i].makeUpperCase()
                chars[j] = chars[j].makeUpperCase()
            }

            //swap to reverse
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
        }

        return String(chars)
    }

    private fun Char.makeUpperCase(): Char {
        var temp = this
        if(temp.isUpperCase()) {
            temp++
            return temp
        }
        temp = temp.uppercaseChar()
        return temp
    }
}