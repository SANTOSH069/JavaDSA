N,K = map(int,input().split())
arr = list(map(int,input().split()))
c = 0
if K in arr:
    c += 1
for i in range(N):
    sub = []
    for j in range(i+1, N):
        sub = arr[i:j+1]
        if max(sub) == K:
            c += 1
        else:
            continue
print(c)