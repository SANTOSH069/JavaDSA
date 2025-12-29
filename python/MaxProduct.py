import math

n = int(input())
nums = list(map(int,input().split()))
currProd = 1
maxProd = 1
for i in range(n):
    sub = []
    for j in range(i,n):
        sub = nums[i:j+1]
        currProd = math.prod(sub)
        maxProd = max(currProd,maxProd)
if(maxProd != 1):
    print(maxProd)
else:
    print(-1)