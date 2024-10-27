n, k = map(int, input().split())
arr_num = []
for i in range(1, n + 1):

    for j in range(1, i + 1):
        print(j, end="")
        arr_num.append(j)

    for j in range(i - 1, 0, -1):
        print(j, end="")
        arr_num.append(j)
    print()
print(arr_num.count(k))
