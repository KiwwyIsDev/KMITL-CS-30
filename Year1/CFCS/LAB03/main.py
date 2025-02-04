import matplotlib.pyplot as plt
import numpy as np

# Define the rate of change function
def download_time(size):
    return size / 5

# File sizes in MB
file_sizes = np.array([20, 55, 99])

# Calculate download times for given file sizes
download_times = download_time(file_sizes)

# Generate a range of file sizes for plotting
sizes = np.linspace(0, 120, 100)
plot_times = download_time(sizes)

# Plot the graph
plt.figure(figsize=(8, 5))
plt.plot(sizes, plot_times, label="t(s) = s / 5", color="blue")
plt.scatter(file_sizes, download_times, color="red", label="Given Points")

# Adding labels and title
plt.title("Download Time vs File Size")
plt.xlabel("File Size (MB)")
plt.ylabel("Download Time (seconds)")
plt.grid(True)
plt.legend()

# Show the plot
plt.show()