class Solution:
    def checkDivisibility(self, n: int) -> bool:
        return n%(sum(d:=[*map(int,str(n))])+__import__('math').prod(d))==0