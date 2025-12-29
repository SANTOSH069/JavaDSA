import math

def maxSub(self,nums):
    n = len(nums)
    currSum = 0
    maxSum = float("-inf")
    for i in range(n):
        sub = []
        for j in range(i,n):
            sub = nums[i:j+1]
            currSum = sum(sub)
            maxSum = max(currSum,maxSum)
            if(maxSum > currSum):
                return sub
            else:
                continue


