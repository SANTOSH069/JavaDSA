N = int(input())
M = int(input())
X,Y = map(list(map(int,input().split())))
coup = max(X)
totCost = 0
totCost += coup
for i in range(Y):
    if X[i] - coup < 0:
        continue
    else:
        totCost += X[i]
if totCost <= sum(Y):
    print("COUPAN")
else:
    print("NO COUPAN")

