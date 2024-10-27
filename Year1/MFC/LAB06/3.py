import math


def calculate_angle(a: float, b: float, angle_A: float) -> float:
    """
    calcu triangle use sine Rule
    a (float): ความยาวด้านตรงข้ามมุม A
    b (float): ความยาวด้านตรงข้ามมุม B
    angle_A (float): มุม A ในหน่วยองศา


    """
    angle_A_rad = math.radians(angle_A)
    sin_B = (b * math.sin(angle_A_rad)) / a
    angle_B = math.degrees(math.asin(sin_B))

    return angle_B


a = 2.5
b = 3.41
angle_A = 30

angle_B = calculate_angle(a, b, angle_A)
print(f"มุม B ประมาณ {angle_B:.2f} องศา")
