"""
จงเขียนโปรแกรมหาคำตอบ โดยการอินทิเกรตแบบหลายชั้น
∫∫(sin**2x cos x) dx dy
"""

import sympy as sym
x, y = sym.symbols('x y')
f = sym.sin(x)**2 * sym.cos(x)
result = sym.integrate(sym.integrate(f, x), y)
print("Indefinite Double Integral =")
sym.pprint(result)