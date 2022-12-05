package strings.commenprefix

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        for (i in strs[0].indices) {
            if (strs[0].isEmpty()) return  ""
            val c: Char = strs[0][i]
            for (j in 1 until strs.size) {
                if (i == strs[j].length || strs[j][i] != c) {
                    return strs[0].substring(0, i)
                }
            }
        }

        return strs[0]
    }

}