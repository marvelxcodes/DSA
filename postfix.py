x = input()

y = []

for i in range(0, len(x), 1):
    if x[i].isdigit():
        y.append(int(x[i]))
    else:
        b,a = int(y.pop()), int(y.pop())
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
