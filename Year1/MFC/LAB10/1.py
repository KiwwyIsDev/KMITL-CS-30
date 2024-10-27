"""
1.จงเขียนเกมจำจำนวนฟีโบนักชี (Fibonacci number) จะต้องจำจำนวนฟีโบนักชี 5 จำนวน เป็นเวลา 5 วินาที จำนวน 3 รอบ เงื่อนไขมีดังนี้
ให้รับระดับความยากของเกม 3 ระดับ 1) ง่าย 2) ปานกลาง 3) ยาก
ง่าย คือ จะต้องคำนวณจำนวนฟีโบนักชีลงใน List จำนวน 10 จำนวน
ปานกลาง คือ จะต้องคำนวณจำนวนฟีโบนักชีลงใน List จำนวน 20 จำนวน
ยาก คือ จะต้องคำนวณจำนวนฟีโบนักชีลงใน List จำนวน 30 จำนวน
ให้สุ่มจำนวนใน List 5 จำนวน มาแสดงผล
จับเวลา 5 วินาที แล้วล้างหน้าจอ
ทายจำนวน Fibonacci
ทำทั้งหมด 3 รอบ

--- Fibonacci Memory Game ---
Choose difficulty level (1 = Easy, 2 = Medium, 3 = Hard): 2

Remember this sequence: [5, 8, 13, 21, 34]

จับเวลา 5 วินาที แล้วล้างหน้าจอ

Enter the Fibonacci sequence: 5 8 13 21 34
Correct!

Remember this sequence: [13, 21, 34, 55, 89]

จับเวลา 5 วินาที แล้วล้างหน้าจอ

Enter the Fibonacci sequence: 13 21 34 55 89
Correct!

Remember this sequence: [5, 8, 13, 21, 34]

จับเวลา 5 วินาที แล้วล้างหน้าจอ

Enter the Fibonacci sequence: 1 1 1 1 1
Wrong! The correct sequence was [5, 8, 13, 21, 34]

You guessed correctly in 2 out of 3 rounds.
"""

import time
import random
from os import system


def fibonacci_sequence(n):
    fib = [0, 1]
    for i in range(2, n):
        fib.append(fib[i - 1] + fib[i - 2])
    return fib


def select_level():
    while 1:
        try:
            level = int(
                input("Choose difficulty level (1 = Easy, 2 = Medium, 3 = Hard): ")
            )
            if level not in [1, 2, 3]:
                print("Invalid Level")
            else:
                return level * 10
        except:
            print("Invalid Level")


def main():
    correct = 0
    print("--- Fibonacci Memory Game ---")
    level = select_level()
    for i in range(3):
        print()
        fibo = fibonacci_sequence(level)
        random_fibo = random.sample(fibo, 5)
        print(f"Remember this sequence: {random_fibo}")
        time.sleep(5)
        system("cls")
        answer_input = input("Enter the Fibonacci sequence: ")
        if answer_input.split() == list(map(str, random_fibo)):
            print("Correct!")
            correct += 1
        else:
            print(f"Wrong! The correct sequence was {random_fibo}")
        time.sleep(1)
        system("cls")

    print(f"You guessed correctly in {correct} out of 3 rounds.")


main()
