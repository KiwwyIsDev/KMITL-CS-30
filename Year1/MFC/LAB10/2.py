"""
จงเขียนโปรแกรมเกม Hangman โดยใช้ Tuple เก็บคำที่จะใช้ในการทาย  ดังนี้ "apple", "banana", "cherry", "orange" และ "strawberry" ซึ่งมีเงื่อนไขในการเขียนโปรแกรม คือ
ให้สุ่มคำที่ต้องการทาย
ในการใบ้คำให้แสดงที่หน้าจอว่าคำนั้นประกอบด้วยกี่ตัวอักษร และถ้าตำแหน่งใดเป็นสระให้แสดงออกมาเลย เช่น หากต้องใบ้คำว่า apple ให้แสดงที่หน้าจอว่า a _ _ _ e หรือหากต้องใบ้คำว่า banana ให้แสดงที่หน้าจอว่า _ a _ a _ a เป็นต้น
วนลูปให้ผู้เล่นเกมทายไปเรื่อย ๆ จนกระทั่งทายตัวอักษรของคำนั้น ๆ ถูกต้องทุกตำแหน่งจึงออกจากโปรแกรม โดยในการทาย หากผู้เล่นเกมทายถูกให้แสดงตำแหน่งตัวอักษรที่ผู้เล่นเกมทายถูกด้วย เช่น หากคำใบ้ คือ a _ _ _ e และผู้เล่นเกมทายว่าเป็นตัวอักษร p ให้แสดงที่หน้าจอ a p p _ e และหากต่อมาผู้เล่นเกมทายว่าเป็นตัวอักษร o ซึ่งผิด ก็ยังคงต้องแสดง a p p _ e เป็นต้น
เมื่อผู้เล่นทายตัวอักษรถูกต้องทุกตำแหน่งแล้วให้แสดงข้อความยินดีกับผู้เล่นออกทางหน้าจอด้วย

Welcome to Hangman!

Hint: a _ _ _ e
Guess a letter: p
Correct guess: p

Hint: a p p _ e
Guess a letter: o
Incorrect guess: o

Hint: a p p _ e
Guess a letter: l
Correct guess: l

Congratulations! You guessed the word 'apple' correctly!

"""

import random

words = ("apple", "banana", "cherry", "orange", "strawberry")


def first_hint(word: str):
    vowels = ["a", "e", "i", "o", "u"]
    return [i if i in vowels else "_" for i in word]


def print_list(lst):
    print(" ".join(lst))


def main():
    print("Welcome to Hangman!")
    print()
    word = random.choice(words)
    hint = first_hint(word)
    while 1:
        print_list(hint)

        guess = input("Guess a letter: ")
        if guess in word:
            print(f"Correct guess: {guess}")
            for i in range(len(word)):
                if word[i] == guess:
                    hint[i] = guess
        print()
        if "_" not in hint:
            print(f"Congratulations! You guessed the word '{word}' correctly!")
            break


main()
