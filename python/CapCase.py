word = str(input().split())
for i in range(len(n)):
    if word[i][0].lower():
       word[i] =  word[i][0].upper() + word[i][1:]
    else:
        if word[i].isupper():
            continue
        else:
            word[i] = word[i][0].upper() + word[i][i:].lower()
print(*word)