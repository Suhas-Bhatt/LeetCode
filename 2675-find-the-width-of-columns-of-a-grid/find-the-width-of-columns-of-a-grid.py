class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        ans=[]
        for i in range(len(grid[0])):
            flag=0
            for j in range(len(grid)):
                flag=max(len(str(grid[j][i])),flag)
            ans.append(flag)
        return ans