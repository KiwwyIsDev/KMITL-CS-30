# 1
import sympy as sym

I, t = sym.symbols("I t")
I = sym.Function("I")
ode = sym.Eq(I(t).diff(t), 0.05 * (1000.0 - I(t)))
general_solution = sym.dsolve(ode, I(t), ics={I(0): 0})
print(f"Solution of the differential equation: {general_solution}")

solution = general_solution.rhs
ode1 = sym.Eq(0.8 * 1000.0, solution)
time_to_80_percent = sym.solve(ode1, t)[0]
print(
    f"Time required for data to spread to 80% of the network: {time_to_80_percent:.2f} second"
)

# 2
import sympy as sym
import numpy as np
import matplotlib.pyplot as plt


t_80 = sym.solve(sym.Eq(0.8 * 1000.0, solution), t)[0]
I_80 = 0.8 * 1000.0

f_I = sym.lambdify(t, solution, "numpy")

t_values = np.linspace(0, 100, 1000)
I_values = f_I(t_values)


plt.plot(t_values, I_values, label="I(t) = N(1 - e^-kt)", linewidth=3, color="aqua")
plt.scatter(
    [float(t_80)],
    [I_80],
    color="red",
    s=100,
    label=f"80% at t = {float(t_80):.2f} sec",
    marker="x",
)
plt.axvline(x=float(t_80), color="pink", linestyle="--", alpha=0.7)
plt.axhline(y=I_80, color="pink", linestyle="--", alpha=0.7)
plt.xlim(0, 100)
plt.ylim(0, 1000)
plt.xlabel("Time (seconds)")
plt.ylabel("Number of devices with data")
plt.title("Data Propagation in a Network")
plt.legend()
plt.grid(True)
plt.show()

# 3
import numpy as np
import matplotlib.pyplot as plt
import sympy as sym

x = sym.symbols("x")
T = sym.Function("T")
ode = sym.Eq(T(x).diff(x) + 0.3 * T(x), 30 + 10 * sym.sin(0.5 * x))
solution = sym.dsolve(ode, T(x))
general_solution = solution.rhs
C1 = sym.symbols("C1")
T_values = [40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100]
x_vals = np.linspace(0, 20, 1000)
c1_values = []
for T_val in T_values:
    specific_eq = sym.Eq(general_solution.subs(x, 0), T_val)
    c1_value = sym.solve(specific_eq, C1)[0]
    c1_values.append(c1_value)

plt.figure(figsize=(10, 6))
for T_val, c1_value in zip(T_values, c1_values):
    specific_solution = general_solution.subs(C1, c1_value)
    T_vals = [specific_solution.subs(x, val) for val in x_vals]
    plt.plot(
        x_vals, T_vals, label=f"T(0) = {T_val:.2f} , C1 = {c1_value:.2f}", linewidth=5
    )

plt.xlabel("Time(Seconds)")
plt.ylabel("CPU Temperature Â°C")
plt.xlim(0, 20)
plt.ylim(0, 120)
plt.title("CPU Temperature Variation Over Time")
plt.legend()
plt.grid(True)
plt.show()
