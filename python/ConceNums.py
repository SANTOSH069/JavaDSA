n = int(input())
arr= list(map(int,input().split()))
c = 1
res = arr.sort()

for i in range(N):
    if arr[i] > arr[i-1]:
        c += 1
    else:
        continue
print(c)