# 1
import sympy as sym

x = sym.symbols("x")
y = sym.Function("y")
ode = sym.Eq(2 * y(x) - 1 / x**3, -x * y(x).diff(x))
print(sym.dsolve(ode, y(x)))

# 2
import sympy as sym

x = sym.symbols("x")
y = sym.Function("y")
ode = sym.Eq(2 * y(x) - (1 / x**3), -x * y(x).diff(x))
solution = sym.dsolve(ode, y(x))

constant_C1 = sym.symbols("C1")
general_solution = solution.rhs
print(sym.solve(general_solution.subs(x, 1) - 0.5, constant_C1)[0].evalf(3))

# 3
import sympy as sym

x = sym.symbols("x")
y = sym.Function("y")
ode = sym.Eq(2 * y(x) - 1 / x**3, -x * y(x).diff(x))
solution = sym.dsolve(ode, y(x), ics={y(1): 0.5})
general_solution = solution.rhs
print(general_solution.subs(x, 5).evalf(2))

# 4
import sympy as sym
import numpy as np
import matplotlib.pyplot as plt

x = sym.symbols("x")
y = sym.Function("y")
ode = sym.Eq(2 * y(x) - 1 / x**3, -x * y(x).diff(x))
solution = sym.dsolve(ode, y(x), ics={y(1): 0.5})
y_function = sym.lambdify(x, solution.rhs, "numpy")
x_values = np.linspace(1, 10, 1000)
y_values = y_function(x_values)
plt.plot(x_values, y_values, color="#007acc", linewidth=4, label="C1 = 1.50")
plt.xlabel("x")
plt.ylabel("y(x)")
plt.xlim(0, 10)
plt.ylim(0, 0.5)
plt.title("Graph of y(x) with C1 = 1.50")
plt.legend()
plt.show()
