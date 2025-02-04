import sympy as sym

a,t,b,T = sym.symbols('a t b T')
f = a * t + b
fln = sym.simplify(sym.integrate(f, (t, 0, T)))
avg = sym.simplify((1/T) * (sym.integrate(f, (t, 0, T))))
print("Integral I =")
sym.pprint(fln)
print("Average Bandwidth = I/T =")
sym.pprint(avg)
