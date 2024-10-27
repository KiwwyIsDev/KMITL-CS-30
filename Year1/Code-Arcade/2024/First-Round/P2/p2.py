n = float(input())
a = float(input())
b = float(input())

# print(a * n)
if n > 1:
    x, y = divmod(n, 2)
    promoto = x * b
    etc = y * a
    total = promoto + etc
    normal = n * a
    print(min(int(total), int(normal)))
else:
    print("NO")
