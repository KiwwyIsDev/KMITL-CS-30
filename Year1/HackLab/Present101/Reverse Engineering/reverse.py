encoded_flag = open("enc", encoding="utf-8").read()
flag = ""
for i in range(0, len(encoded_flag)):
    character1 = chr((ord(encoded_flag[i]) >> 8))
    character2 = chr(encoded_flag[i].encode("utf-16be")[-1])
    flag += character1
    flag += character2

print("Flag: " + flag)
