# class Solution:
#     def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
#         a=tickets[k]
#         ans=0
#         for i in range(len(tickets)):
#             if i>k:
#                 if tickets[i]>=a+1:
#                     ans+=a
#                 else:
#                     ans+=tickets[i]
#             elif k==i:
#                 ans=ans+a-1
#             else:
#                 if tickets[i]>=a:
#                     ans+=a-1
#                 else:
#                     ans+=tickets[i]

#         return ans
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        return sum(min(tickets[k] - int(i > k), t) for i, t in enumerate(tickets))