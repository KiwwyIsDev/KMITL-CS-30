"""
นักศึกษาฝากเงิน 50,000 บาท ในบัญชีออมทรัพย์ที่ให้ดอกเบี้ย 3% ต่อปี 
โดยดอกเบี้ยจะถูกทบต้นปีละครั้ง ต้องการทราบว่าหลังจาก 10 ปี นักศึกษาจะมีเงินในบัญชีเท่าไร
สูตรดอกเบี้ยทบต้น A = P(1 + r)^n
A = จำนวนเงินสุดท้าย
P = เงินต้น
r = อัตราดอกเบี้ยต่อปี/100
n = จำนวนปี

เงื่อนไข
ให้เขียน 2 ฟังก์ชัน โดยที่ฟังก์ชันที่ 1 คำนวณดอกเบี้ยทบต้น ชื่อฟังก์ชันว่า calculate_compound_interest และฟังก์ชันที่ 2 แสดงผลลัพธ์การคำนวณดอกเบี้ยทบต้น ชื่อฟังก์ชันว่า display_results
บรรทัดที่ส่งค่าไปคำนวณในฟังก์ชันให้ใช้โค้ด result = calculate_compound_interest(principal=50000, rate=3, years=10)
บรรทัดการรับค่าของฟังก์ชันที่ 1 คำนวณดอกเบี้ยทบต้นให้ใช้โค้ด def calculate_compound_interest(**kwargs):
ใส่ Doc String ของทั้ง 2 ฟังก์ชัน
ใส่ Type Hints ให้กับตัวแปรที่ฟังก์ชันรับเข้ามาและค่าที่รีเทิร์นออกมาจากฟังก์ชัน

เงินต้น 50000.00 บาท
อัตราดอกเบี้ย 3.00% ต่อปี
ระยะเวลา 10 ปี
จำนวนเงินสุดท้าย 67195.82 บาท
ดอกเบี้ยที่ได้รับ 17195.82 บาท
"""


def calculate_compound_interest(**kwargs) -> float:
    """calcu late compound interest"""
    return kwargs["principal"] * (1 + (kwargs["rate"] / 100)) ** kwargs["years"]


def display_results(result, p) -> None:
    """display results"""
    print(f"จำนวนเงินสุดท้าย {result:.2f} บาท")
    print(f"ดอกเบี้ยที่ได้รับ {result - p:.2f} บาท")


p = 50000
result = calculate_compound_interest(principal=p, rate=3, years=10)
display_results(result, p)
