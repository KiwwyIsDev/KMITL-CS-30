"""
4.จงเขียนโปรแกรมแสดงจำนวนฮาร์ชาด (Harshad Number) 10 ตัวต่อบรรทัด ตั้งแต่ 1 ถึง 100
Harshad numbers between 1 and 100:
1 2 3 4 5 6 7 8 9 10
12 18 20 21 24 27 30 36 40 42
45 48 50 54 60 63 70 72 80 81
84 90 100
"""


def ishardhad(n):

    # sum_o = 0
    # for num_o in str(n):
    #     sum_o += int(num_o)
    # return n % sum_o == 0
    return n % sum(int(num_o) for num_o in str(n)) == 0


i = 0
for k in range(1, 101):

    if ishardhad(k):
        print(k, end=" ")
        i += 1
        if i == 10:
            print()
            i = 0
