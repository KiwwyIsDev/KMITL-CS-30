#include <stdio.h>

void runner() {
    int num = 10;
    int *ptr; 
    ptr = &num;
    int **dPtr; 
    dPtr = &ptr;

    printf("Value at num = %d\n", num);
    printf("Address of num = %p\n\n", (void*)&num);

    // 1.1
    printf("Value at ptr = %p\n", (void*)ptr);
    printf("Address of ptr = %p\n", (void*)&ptr);
    printf("Value at *ptr = %d\n\n", *ptr);

    printf("Value at dPtr = %p\n", (void*)dPtr);

    // 1.2
    printf("Address of dPtr = %p\n", (void*)&dPtr);
    printf("Value at **dPtr = %d\n\n", **dPtr);
}

// 1.3
int main() {
    runner();  // เรียกใช้ฟังก์ชัน runner
    return 0;  // 1.4
}

