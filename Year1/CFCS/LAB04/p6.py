"""
จงเขียนโปรแกรมหาคำตอบ โดยการอินทิเกรตแบบหลายชั้น
∫∫∫ 5<=z<=,3<=y<=4,1<=x<=2 ((x+y)/sqrt(z)) dx dy dz
"""

import sympy as sym
x, y, z = sym.symbols('x y z')
sym.pprint(sym.simplify(sym.integrate((x + y)/sym.sqrt(z), (x, 1, 2), (y, 3, 4), (z, 5, 6))))