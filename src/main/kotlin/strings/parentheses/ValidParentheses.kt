package strings.parentheses

import java.util.ArrayDeque

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val map = mapOf<Char, Char>(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )

        val stack = ArrayDeque<Char>()

        s.forEach { c ->
            if(map[c] != null && map[c] == stack.peek()) {
                stack.pop()
            } else {
                stack.push(c)
            }

        }

        return stack.isEmpty()
    }
}