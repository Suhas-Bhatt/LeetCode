class Solution:
    def climbStairs(self, n: int) -> int:
        a=0
        b=1
        for i in range(n):
            c=b+a
            a=b
            b=c
        return b