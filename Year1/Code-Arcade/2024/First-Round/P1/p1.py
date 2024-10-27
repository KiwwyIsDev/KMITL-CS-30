a = input()
b = input()

b = list(map(int, b.split()))

# print(a, b)
before = b[0]
cant = False
for i in b:
    if i == 0 or i < 0:
        cant = "bruh"
        break
    if abs(i - before) > 2:
        # print(i, before)
        cant = True
        break
    before = i

if cant == "bruh":
    print('-_-"')
elif cant:
    print("No")
else:
    print("Yes")
