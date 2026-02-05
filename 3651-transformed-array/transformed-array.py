class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        N=len(nums)
        res =[]
        for i in range(N):
            res.append(nums[(i+nums[i])%N])
        return res