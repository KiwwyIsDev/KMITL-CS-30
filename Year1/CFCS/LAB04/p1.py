"""
ทีมไอทีทดลองเปิดให้ผู้ใช้งานเข้ามาใช้งานระบบพร้อมกันอย่างกะทันหัน ในช่วงเวลา 1 วินาทีแรก พบว่า “Ping” (เวลาแฝง หรือ Latency) ของเซิร์ฟเวอร์เริ่มเพิ่มขึ้นตามเสี้ยววินาทีที่ผ่านไป โดยสามารถเขียนเป็นฟังก์ชัน Ping(t)

ต้องการให้แสดงค่าที่ผ่านการอินทิกรัลแล้ว เพื่อหาปริมาณการสะสมของ Ping

ตอบ
Integral I = 4*log(2)/pi + 10
"""

import sympy as sym
t = sym.symbols("t")
p = 10 + 2 * sym.tan(sym.pi*t/4)
integrate = sym.integrate(p, (t, 0, 1))
print(f"Integral I = {sym.simplify(integrate)}")