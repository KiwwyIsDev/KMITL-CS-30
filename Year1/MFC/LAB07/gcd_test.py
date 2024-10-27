def gcd(a, b):
    print("RECICVE", a, b)
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


# Example usage:
a = 48
b = 18
result = gcd(a, b)
print(f"GCD of {a} and {b} is {result}")
