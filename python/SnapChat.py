T = int(input())
N = int(input())
arr1 = list(map(int,input().split()))
arr2 = list(map(int,input().split()))
currStr = 0
maxStr  = float("-inf")
while(l < N):
    if arr1[l] > 0 and arr2[l] > 0:
        currStr += 1
        maxStr = max(currStr,maxStr)
    if arr1[l] == 0 or arr2[l] == 0 :
        currStr = 0
        maxStr = max(currStr,maxStr)
        l+= 1
print(maxStr)