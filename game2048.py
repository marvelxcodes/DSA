import math
t = int(input())
x = list(map(int,input().split()))


def fib(n):
    if n==1 or n==2:
        return 1
    return fib(n-1) + fib(n-2)

for i in x:
    if i & (i-1) == 0:
        a = int(math.log(i, 2))
        if a == 1:
            print(0)
        elif a == 2 or a == 3:
            print(1)
        else:
            print(fib(a-1))
    else:
        print(0)
