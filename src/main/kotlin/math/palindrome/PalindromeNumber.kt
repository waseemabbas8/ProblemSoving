package math.palindrome

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        var temp: Int = x
        var number = 0

        while(temp != 0) {
            val dif = temp % 10
            temp /= 10
            number = (number * 10) + dif
        }
        return number == x
    }
}