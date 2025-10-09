t = int(input())

for i in range(t):
    l = int(input())
    a = input()
    y , n = 0 , 0

    for j in a:
        if (j == '0'):
            n+=1
        else:
            y+=1
    
    if y > n:
        print("YES")
    else:
        print("NO")
