n = int(input("Input : "))
nprime = [561, 1105, 1729]
print(f"Prime : {2**n - 1 % n == 1 and n not in nprime}")