start = 0b1101
maigcXOR = 0b1010
# want 0111 only xor
output = start ^ maigcXOR
print(bin(output))
print(int(bin(output), 2))

# fix
# output = 0111
# want to close all 0000
magicAND = 0b000
print(bin(output & magicAND))
print(int(bin(output & magicAND), 2))