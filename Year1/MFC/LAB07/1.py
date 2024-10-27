"""
ให้รับค่า 1 ค่าผ่านทางคีย์บอร์ด ซึ่งเป็นอะไรก็ได้ และให้เขียนฟังก์ชันตรวจสอบว่าสิ่งที่กรอกเข้ามาเป็นจำนวนเต็มบวกหรือไม่
Input : +123.0
123 is a positive integer
--
Input : a123
a123 is not a positive integer
"""


def check():

    num = input("Number: ")
    try:
        num = float(num)
        if num.is_integer() and num > 0:
            num = int(num)
            print(f"{num} is a positive integer")
        else:
            print(f"{num} is not a positive integer")
    except:
        print(f"{num} is not a positive integer")


check()
