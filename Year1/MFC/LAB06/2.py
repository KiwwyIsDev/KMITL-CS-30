"""
บริษัทสร้างบ้านแห่งหนึ่ง ชอบสร้างหลังคาทรงประหลาด โดยให้ลูกค้าบอกเพียงความยาวทั้ง 3 ด้านของหลังคาที่ต้องการ บริษัทมีหน้าที่หาด้านตรงข้ามมุม A, B และ C ของความยาว a, b และ c หน่วยที่ลูกค้าบอกมา ตามลำดับ ให้คำนวณหา
(ก) คำนวณมุม A, B และ C (หน่วยเป็นองศา) โดยใช้ Cosine Rule
(ข) ตรวจสอบว่าผลบวกของมุมรวมภายในสามเหลี่ยมมีค่าเท่ากับ 180

เงื่อนไข
ให้เขียน 2 ฟังก์ชัน โดยที่ฟังก์ชันที่ 1 คำนวณมุมของรูปสามเหลี่ยม ชื่อฟังก์ชันว่า calculate_angles และฟังก์ชันที่ 2 คำนวณผลบวกของมุมรวมภายในสามเหลี่ยม ชื่อฟังก์ชันว่า sum_of_angles
ใส่ Doc String ของทั้ง 2 ฟังก์ชัน
ใส่ Type Hints ให้กับตัวแปรที่ฟังก์ชันรับเข้ามาและค่าที่รีเทิร์นออกมาจากฟังก์ชัน

a = 12
b = 7
c = 8
(ก) Angle A = 106.07
      Angle B = 34.09
      Angle C = 39.84
(ข) Sum of internal angles = 180.00
      Is the sum equal to 180?: True
"""

import math


def calculate_angles(a: float, b: float, c: float) -> tuple[float, float, float]:
    """
    calcu triangle use cosine rule
    a (float): ความยาวด้านตรงข้ามมุม A
    b (float): ความยาวด้านตรงข้ามมุม B
    c (float): ความยาวด้านตรงข้ามมุม C
    """
    angle_A = math.degrees(math.acos((b**2 + c**2 - a**2) / (2 * b * c)))
    angle_B = math.degrees(math.acos((a**2 + c**2 - b**2) / (2 * a * c)))
    angle_C = math.degrees(math.acos((a**2 + b**2 - c**2) / (2 * a * b)))

    return angle_A, angle_B, angle_C


def sum_of_angles(angles: tuple[float, float, float]) -> float:
    """
    sum angles
    """
    return sum(angles)


a = 12
b = 7
c = 8

angles = calculate_angles(a, b, c)
sum_angles = sum_of_angles(angles)

print(f"Angle A = {angles[0]:.2f}")
print(f"Angle B = {angles[1]:.2f}")
print(f"Angle C = {angles[2]:.2f}")
print(f"Sum of internal angles = {sum_angles:.2f}")
print(f"Is the sum equal to 180?: {math.isclose(sum_angles, 180, abs_tol=1e-9)}")
