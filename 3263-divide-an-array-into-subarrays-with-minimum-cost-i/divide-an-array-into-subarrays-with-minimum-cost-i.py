class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        r = sorted(nums[1:])
        return nums[0]+ r[0]+r[1]