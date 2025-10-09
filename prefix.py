x = input()

y = []

for i in range(len(x)-1, -1 , -1):
    if x[i].isdigit():
        y.append(int(x[i]))
    else:
        a,b = int(y.pop()), int(y.pop())
        if x[i] == "+":
            y.append(a+b)
        elif x[i] == "-":
            y.append(a-b)
        elif x[i] == "^":
            y.append(a**b)
        elif x[i] == "*":
            y.append(a*b)
        elif x[i] == "/":
            y.append(a/b)

print(y[0])
