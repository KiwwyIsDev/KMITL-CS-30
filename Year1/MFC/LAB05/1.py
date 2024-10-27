def convert(size: float = float(input("Gigabytes (GB) : "))):
    mb = size * 1024
    kb = mb * 1024
    byte = kb * 1024
    bit = byte * 8

    print(f"MB: {mb:.2f}\nKB: {kb:.2f}\nByte: {byte:.2f}\nBit: {bit:.2f}")


convert()
