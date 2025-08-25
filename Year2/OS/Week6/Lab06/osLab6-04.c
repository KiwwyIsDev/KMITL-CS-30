#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h> // สำหรับ sleep()

#define NUM_TASKS 4
char *messages[NUM_TASKS];

void *printHello(void *argv) {
    sleep(1);

    // 3.5: แปลง pointer กลับเป็น int โดย cast จาก void* -> int*
    int taskID = *((int *)argv);

    printf("Task %d: %s\n", taskID, messages[taskID]);

    pthread_exit(0);
}

int main(int argc, char *argv[]) {
    pthread_t threads[NUM_TASKS];
    int *input;
    int i, t;

    for (i = 0; i < NUM_TASKS; i++) {
        messages[i] = "Hello KMITL";
    }

    for (t = 0; t < NUM_TASKS; t++) {
        // 3.6: จองหน่วยความจำและเก็บค่า t ไว้ใน input เพื่อไม่ให้ overwrite กัน
        input = (int *) malloc(sizeof(int));
        *input = t;

        printf("Create thread %d\n", t);
        pthread_create(&threads[t], NULL, printHello, (void *)input);

        // 3.7: รอให้ thread ที่สร้างเสร็จก่อนค่อยทำต่อ (synchronous)
        pthread_join(threads[t], NULL);

        // free input หลัง thread จบเพื่อป้องกัน memory leak
        free(input);
    }

    return 0;
}

