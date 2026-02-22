class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        ans=0
        for i in range(left,right+1):
            a=bin(i)
            b=a.count("1")
            if b==0 or b==1:
                continue
            if b==2:
                ans+=1
            else:
                for i in range(2,b):
                    if b%i==0:
                        break
                else:
                    ans+=1

        return ans


        