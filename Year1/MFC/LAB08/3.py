"""
จงเขียนโปรแกรมแสดงค่าสูตรคูณแม่ใด ๆ ผ่านทางคีย์บอร์ด ให้แสดงค่าถอยหลัง โดยใช้คำสั่งทำซ้ำ while True (หรือเทียบเท่า do-while ในภาษา Java) เป็นหลัก
Enter the multiplication table you want: 12
12 * 12 = 144
12 * 11 = 132
12 * 10 = 120
12 * 9 = 108
12 * 8 = 96
12 * 7 = 84
12 * 6 = 72
12 * 5 = 60
12 * 4 = 48
12 * 3 = 36
12 * 2 = 24
12 * 1 = 12
"""

n = int(input("Enter the multiplication table you want: "))
[print(f"{n} * {i} = {n*i}") for i in range(12, 0, -1)]
