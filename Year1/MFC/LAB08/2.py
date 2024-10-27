"""
จงเขียนโปรแกรมแสดงการหาค่าแฟคทอเรียล โดยใช้คำสั่งทำซ้ำ while เป็นหลัก
Please enter a positive integer: 3 
The factorial of 3 is 6
"""

n = int(input("Please enter a positive integer: "))
k = n
i = n
while i > 1:
    i -= 1
    k *= i
print(f"The factorial of {n} is {k}")
