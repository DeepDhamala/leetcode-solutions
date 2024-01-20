class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x <0 else 1
        x = abs(x)

        reversed_x = 0

        while x != 0:
            digit = x % 10

            if reversed_x >(2**31 -1 - digit) // 10:
                return 0
        
            reversed_x = reversed_x * 10 + digit
            x = x // 10

        return sign * reversed_x