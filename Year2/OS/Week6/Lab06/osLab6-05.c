#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

typedef struct mydata {
    double d;
    int i;
} data;

// 4.1: ต้องประกาศฟังก์ชันคืนค่า void*
void *myfunc(void *argv) {
    data *my = (data *)malloc(sizeof(data));
    my->d = 3.14;
    my->i = 40;

    // 4.2: คืน pointer ไปยัง struct
    pthread_exit((void *)my);
}

int main() {
    pthread_t tid;
    data my;
    void *retval;

    // 4.3: ไม่ส่ง argument ให้ thread
    pthread_create(&tid, NULL, myfunc, NULL);

    // join thread แล้วเก็บค่าที่ thread คืนมาใน retval
    pthread_join(tid, &retval);

    // 4.4: แปลง void* กลับเป็น struct data*
    my = *((data *)retval);

    // 4.5: free memory ที่ malloc มาใน thread
    free(retval);

    printf("%f, %d\n", my.d, my.i);

    return 0;
}

