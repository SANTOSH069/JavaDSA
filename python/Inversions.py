n = int(input())
nums = list(map(int, input().split()))
c = 0
for i in range(n):
    sub = []
    for j in range(i,n):
        sub = nums[i:j+1]
        if len(sub) == 2:
            if (sub[i] > sub[j] and i < j):
                c += 1
            else:
                c += 0
        else:
            continue
print(c)