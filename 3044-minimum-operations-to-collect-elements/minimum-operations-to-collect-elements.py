class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        s,i=set(),len(nums)-1
        while len(s)<k:
            if nums[i]<=k:
                s.add(nums[i])
            i -=1
        return len(nums)-i-1
        