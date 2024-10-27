"""
ให้รับค่าจำนวนเต็มบวก 0 ถึง 9999 ผ่านทางคีย์บอร์ด จากนั้นทำการกลับค่าตัวเลขที่ได้จากหลังไปหน้า

เงื่อนไข
ให้ตรวจสอบค่าที่รับผ่านทางคีย์บอร์ด ว่าเป็นจำนวนเต็มบวกหรือไม่
ไม่ให้ใช้คำสั่งเงื่อนไข Loop ทุกชนิด

Please enter positive integer : 1234
Inverse number is: 4321
--
Please enter positive integer : a1234
a1234 is not a positive integer, exit !!!
"""


def pos(num):

    try:
        num = float(num)
        if num.is_integer() and num > 0:
            # print(f"{num} is a positive integer")
            return int(num)
        # else:
        # print(f"{num} is not a positive integer")

    except:
        # print(f"{num} is not a positive integer")
        pass
    return False


num1 = pos(input("Positive Integer 1 : "))
# print(num1)
# 0 < num1 < 10000
if num1 and num1 in range(1, 10000):
    print(f"Inverse number is: {str(num1)[::-1]}")
else:
    print("as is not a positive integer, exit !!!")
