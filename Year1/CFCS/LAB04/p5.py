"""
จงเขียนโปรแกรมหาคำตอบ โดยการอินทิเกรตแบบหลายชั้น
∫∫∫(x**2 * y * sin(z) + 8 * cos(y)**2) dx dy dz
"""

import sympy as sym
x, y, z = sym.symbols('x y z')
f = x**2 * y * sym.sin(z) + 8 * sym.cos(y)**2
result = sym.integrate(f, (x, 0, 1), (y, 0, sym.pi), (z, 0, sym.pi/2))
print("Triple Integral Result =")
sym.pprint(result)
