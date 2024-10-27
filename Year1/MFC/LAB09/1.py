"""
1.จงเขียนโปรแกรมจัดการสินค้าคงคลัง (Inventory) โดยมีสินค้าเริ่มต้น ซึ่งประกาศเป็น Dictionary ดังนี้
แล็ปท็อป (Laptop) จำนวน 10 เครื่อง
โทรศัพท์ (Phone) จำนวน 25 เครื่อง
แท็บเล็ต (Tablet) จำนวน 15 เครื่อง
ให้เขียนโปรแกรมที่ผู้ใช้สามารถเลือกเมนูการจัดการได้ 3 อย่าง ดังนี้
กด 1 ดูรายการสินค้า (View inventory list) : ต้องทำงานภายใต้ฟังก์ชันชื่อ display_inventory
โดยทำการแสดงการสินค้าคงคลัง (Inventory) ใน Dictionary

กด 2 เพิ่ม/ลดสินค้า (Add/Reduce products) : ต้องทำงานภายใต้ฟังก์ชันชื่อ update_inventory
- ให้เลือกสินค้าที่ต้องการเพิ่ม และให้ใส่จำนวนเพิ่มหรือลดสินค้านั้น
- หากสินค้าที่ต้องการเพิ่มนั้น ไม่พบใน Dictionary ให้ถามผู้ใช้ว่าต้องการเพิ่มสินค้านั้นหรือไม่ (y/n) หากเพิ่มสินค้า (กด y) ให้ใส่จำนวนสินค้าเริ่มต้นของสินค้านั้น หากไม่เพิ่มสินค้า (กด n) และให้กลับไปที่หน้าเลือกเมนูการจัดการ
กด 3 ลบสินค้า (Delete products) : ต้องทำงานภายใต้ฟังก์ชันชื่อ delete_inventory ให้เลือกสินค้าที่ต้องการเพิ่มลบ ให้ถามผู้ใช้ว่าต้องการลบสินค้านั้นหรือไม่ (y/n) หากลบสินค้า (กด y) หากไม่ลบสินค้า (กด n) และให้กลับไปที่หน้าเลือกเมนูการจัดการ
กด 4 ออกจากโปรแกรม (Exit the program)
หมายเหตุ : จำนวนสินค้นหาคงคลัง ไม่สามารถติดลบได้
Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete productsx
4. Exit the program
Select an option: 1

Inventory list:
Laptop: 10
Phone: 25
Tablet: 15

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 2

Enter the product name you want to update: Laptop
Enter the quantity to add or subtract: 50
The updated quantity of Laptop is: 60

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 2

Enter the product name you want to update: Phone 
Enter the quantity to add or subtract: -100
Cannot reduce the quantity of Phone because it will result in a negative amount!

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 2

Enter the product name you want to update: Notebook
Notebook is not in the inventory. Would you like to add it? (y/n): y
Enter the quantity to add: 50
Added new product Notebook with quantity 50.

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 3

Enter the product name you want to delete: Tablet
Are you sure you want to delete Tablet? (y/n): y
Tablet has been deleted from the inventory.

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 1

Inventory list:
Laptop: 60
Phone: 25
Notebook: 50

Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
Select an option: 4

Exiting the program

"""

inv = {"Laptop": 10, "Phone": 25, "Tablet": 15}
negative_msg = (
    "Cannot reduce the quantity of Phone because it will result in a negative amount!"
)


def show_menu():
    print(
        """Inventory Management System:
1. View inventory list
2. Add/Reduce products
3. Delete products
4. Exit the program
"""
    )


def stringtoint(number) -> int:
    try:
        new_number = float(number)
        if new_number.is_integer():
            return int(number)
    except:
        pass
    print("Not a number !")
    return False


def display_inventory():
    global inv
    print("Inventory list:")
    for key, value in inv.items():
        print(key + ":", value)


def update_inventory():
    global inv
    print("Item stock ->", end=" ")
    [print(f"{i}: {v}", end=" ") for i, v in inv.items()]
    print()
    user_req = input("Enter the product name you want to update: ")
    user_get = inv.get(user_req)
    if not user_get:
        q_update = input(
            f"{user_req} is not in the inventory. Would you like to add it? (y/n): "
        )
        if q_update.lower() == "y":
            num_req = stringtoint(input("Enter the quantity to add: "))
            if num_req >= 0:
                inv[user_req] = num_req
                print(f"Added new product {user_req} with quantity {num_req}.")
            else:
                print(negative_msg)
    else:
        num_req = stringtoint(input("Enter the quantity to add or subtract: "))
        if user_get + num_req >= 0:
            inv[user_req] = user_get + num_req
        else:
            print(negative_msg)


def delete_inventory():
    global inv
    del_req = input("Enter the product name you want to delete: ")
    if inv.get(del_req):
        if input("Are you sure you want to delete Tablet? (y/n): ").lower() == "y":
            print("Tablet has been deleted from the inventory.")
            inv.pop(del_req)
    else:
        print(f"{del_req} not in stock !")


show_menu()
while 1:
    try:
        user_select = int(input("Select an option: "))
        match user_select:
            case 1:
                display_inventory()
            case 2:
                update_inventory()
            case 3:
                delete_inventory()
            case 4:
                print()
                print("Exiting the program")
                exit(0)
            case _:
                print("input correct option !")
    except ValueError:
        print("input correct option !")
