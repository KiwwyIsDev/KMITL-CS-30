"""
จากความรู้ที่เรียนมาทั้งหมด จงเขียนโปรแกรมการเข้ารหัสซีซาร์ (Caesar Cipher) โดยมีเงื่อนไขเพิ่มเติมจากวิธีการปกติ คือ
เฉพาะตัวเลข 0-9 ให้ย้อนวิธีคิดของตัวอักษร เช่น ผู้ใช้กรอก 3 จาก A จะ +3 เป็น D แต่ถ้าเป็นตัวเลข ผู้ใช้กรอก 5 จะ -3 เป็น 2
ข้อความทั้งหมด แต่ละคำให้สลับลำดับอักษรจากหน้าไปหลังและหลังไปหน้า (ตัดเป็นคำ ๆ จากช่องว่าง) เช่น เข้ารหัส Hello เลื่อน +3 จะได้ Khoor สลับลำดับได้ roohK และถอดรหัส Khoor สลับลำดับ Hello เลื่อน -3 จะได้ Khoor

กด e เข้ารหัส กด d ถอดรหัส กด q ออกจากโปรแกรม
e
กรอกข้อความที่ต้องการเข้ารหัส
Hello, World 123
กรอกจำนวนตัวอักษรที่ต้องการเลื่อน
3
========================
Hello, World 123 ถูกเข้ารหัสเป็น: ,roohK gourZ 098
========================

กด e เข้ารหัส กด d ถอดรหัส กด q ออกจากโปรแกรม
d
กรอกข้อความที่ต้องการถอดรหัส
,roohK gourZ 098
กรอกจำนวนตัวอักษรที่ต้องการเลื่อน
3
========================
,roohK gourZ 098 ถูกถอดรหัสเป็น: Hello, World 123
========================

"""

"""
number 123 -> 890
"""


def ceasar_encrypt(word: str, shift: int) -> str:
    result = ""
    for char in word:

        if char.isupper():
            result += chr((ord(char) + shift - 65) % 26 + 65)
        elif char.islower():
            result += chr((ord(char) + shift - 97) % 26 + 97)
        elif char.isdigit():
            result += str((int(char) - shift) % 10)
        else:
            result += char

    return result


def ceasar_decrypt(word: str, shift: int) -> str:
    return ceasar_encrypt(word, -shift)


def rerverse_by_word(word: str) -> str:
    return " ".join([i[::-1] for i in word.split()])


while 1:
    choice = input("กด e เข้ารหัส กด d ถอดรหัส กด q ออกจากโปรแกรม: ")
    while 1:
        if choice.lower() == "q":
            exit(0)
        elif choice.lower() == "e":
            word = input("กรอกข้อความที่ต้องการเข้ารหัส: ")
            shift = int(input("กรอกจำนวนตัวอักษรที่ต้องการเลื่อน: "))
            normal_encrypt = ceasar_encrypt(word, shift)
            # encrypted = " ".join(
            #     ["".join(reversed(i)) for i in normal_encrypt.split()]
            # )
            encrypted = rerverse_by_word(normal_encrypt)

            print("=" * 24)
            print(f"{word} ถูกเข้ารหัสเป็น: {encrypted}")
            print("=" * 24)
            exit(0)
        elif choice.lower() == "d":
            word = input("กรอกข้อความที่ต้องการถอดรหัส: ")
            shift = int(input("กรอกจำนวนตัวอักษรที่ต้องการเลื่อน: "))
            normal_decrypt = ceasar_decrypt(word, shift)
            decrypted = rerverse_by_word(normal_decrypt)
            print("=" * 24)
            print(f"{word} ถูกถอดรหัสเป็น: {decrypted}")
            print("=" * 24)
            exit(0)
        else:
            break
