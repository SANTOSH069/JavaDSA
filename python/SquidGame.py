n = int(input())
arr = list(map(int(input().split())))
d = 0
currSum = 0
maxSum = 0
for d in range(len(arr)):
    if d == 0:
        currSum = sum(arr[d:])
        maxSum = max(currSum,maxSum)
    elif d == n-1:
        currSum = sum(arr[:n-1])
        maxSum = max(currSum,maxSum)
    else:
        currSum = sum(arr[1:d]) + sum(arr[d:])
        maxSum = max(currSum,maxSum)

maxSum = max(currSum,maxSum)
print(maxSum)

