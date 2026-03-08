class Solution:
    def binaryGap(self, n: int) -> int:
        a = bin(n)[2:]
        maxx = 0
        currMax=0
        flag = False
        for i in a:
            if i == '0':
                currMax +=1
                flag = True
            else:
                if flag:
                    currMax += 1
                maxx = max(maxx,currMax)
                currMax=0
        return maxx

class Solution:
    def binaryGap(self, n: int) -> int:
        a = bin(n)[2:]   # binary string
        maxx = 0
        currDist = 0
        started = False
        
        for i in a:
            if i == '1':
                if started:
                    maxx = max(maxx, currDist)
                currDist = 1
                started = True
            else:
                if started:
                    currDist += 1
        
        return maxx

        
        
     





        
        