"""
ให้รับค่าจำนวนเต็มบวก 2 จำนวน ผ่านทางคีย์บอร์ด และให้เขียนฟังก์ชันเพื่อคำนวณค่า GCD (Greatest Common Divisor หรือ ห.ร.ม.) โดยใช้ขั้นตอนวิธีของยุคลิด (Euclidean Algorithm)

เงื่อนไข
ให้ตรวจสอบค่าที่รับผ่านทางคีย์บอร์ด ว่าเป็นจำนวนเต็มบวกหรือไม่
ไม่ให้ใช้คำสั่งเงื่อนไข Loop ทุกชนิด

Positive Integer 1 : 48.0
Positive Integer 2 : +18
GCD : 6
--
Positive Integer 1 : a48
as is not a positive integer, exit !!!
"""


def pos(num):

    try:
        num = float(num)
        if num.is_integer() and num > 0:
            num = int(num)
            # print(f"{num} is a positive integer")
            return num
        # else:
        # print(f"{num} is not a positive integer")

    except:
        # print(f"{num} is not a positive integer")
        pass
    return False


def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


num1 = pos(input("Positive Integer 1 : "))
if num1:
    num2 = pos(input("Positive Integer 2 : "))
    if num2:
        # print(num1, num2)
        gcd = gcd(num1, num2)
        print(f"GCD : {gcd}")
    else:
        print("as is not a positive integer, exit !!!")
else:
    print("as is not a positive integer, exit !!!")
