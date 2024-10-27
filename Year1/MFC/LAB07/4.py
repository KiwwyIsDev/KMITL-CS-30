"""
เขียนโปรแกรมเครื่องคิดเลขอย่างง่ายในรูปแบบของฟังก์ชัน โดยใช้คำสั่ง match-case ซึ่งมีเงื่อนไขดังนี้
ให้เลือกว่าจะทำโอเปอเรเตอร์อะไรก่อนที่จะรับค่าตัวเลขผ่านทางคีย์บอร์ด
กด 1 ให้บวก (+)
กด 2 ให้ลบ (-)
กด 3 ให้คูณ (*)
กด 4 ให้หาร (/)
กด 5 ให้ยกกำลัง (**)
กดอื่น ๆ ให้ขึ้นข้อความ "Please select choice 1-5 only"
ให้ทั้งหมดแสดงผลทศนิยม 2 ตำแหน่ง
"""


def menu():
    print(
        f"""{"#" * 28}
#   Please select choice   #
{"#" * 28}
# 1. Plus      (+)         #
# 2. Minus     (-)         #
# 3. Multiply  (*)         #
# 4. Divide    (/)         #
# 5. Power     (**)        #
{"#" * 28}
"""
    )


while 1:
    menu()
    choice = input("Select : ")
    try:
        choice = int(choice)
        if choice not in [1, 2, 3, 4, 5]:
            continue

        num1 = float(input("Number 1 : "))
        num2 = float(input("Number 2 : "))
        match choice:
            case 1:
                print(f"{num1:.2f} + {num2:.2f} = {(num1 + num2):.2f}")
                break
            case 2:
                print(f"{num1:.2f} - {num2:.2f} = {(num1 - num2):.2f}")
                break
            case 3:
                print(f"{num1:.2f} * {num2:.2f} = {(num1 * num2):.2f}")
                break
            case 4:
                print(f"{num1:.2f} / {num2:.2f} = {(num1 / num2):.2f}")
                break
            case 5:
                print(f"{num1:.2f} ** {num2:.2f} = {(num1 ** num2):.2f}")
                break
    except ZeroDivisionError:
        print("cant divide by zero")
        continue
    except:
        continue
