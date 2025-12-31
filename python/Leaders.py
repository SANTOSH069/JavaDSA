n = int(input())
arr = list(map(int,input().split()))
ld = []
for i in range(n):
    if i == n-1 or  arr[i] > max(arr[i+1::]):
        ld.append(arr[i])
print(*ld)
