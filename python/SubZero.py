n = int(input())
nums = list(map(int,input().split()))
for i in range(n):
    sub = []
    for j in range(i,n):
        sub = nums[i:j+1]
        if len(sub) == 3:
            if sum(sub) == 0:
                res = sorted(sub)
                print(*res)
            else:
                continue