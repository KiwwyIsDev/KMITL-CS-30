from PIL import Image
from pyzbar.pyzbar import decode
import os

for path in os.listdir("./qr_codes"):
    path = os.path.join("./qr_codes", path)
    print(path)
    data = decode(Image.open(path))

    print(data)

    with open("qr_codes.txt", "a") as f:
        f.write(f"{path}: {data}\n")
