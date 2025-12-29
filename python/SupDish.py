import math

n = int(input())
arr = list(map(int,input().split()))
hash = dict()
sup = []
for hs in arr:
    if hs in hash:
        hash[hs] += 1
    else:
        hash[hs]
for key,val in hash.items():
    if val > n//3:
        sup.append(key)
    else:
        continue
res = sorted(sup)
print(*res)

