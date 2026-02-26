class Solution:
    def hammingWeight(self, n: int) -> int:
        bin(n)[2:]
        return bin(n).count("1")