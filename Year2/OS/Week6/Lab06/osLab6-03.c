#include <stdio.h>
#include <pthread.h>

// Global input
static int input = 999;

// Thread function
void *myfunc(void *argv) {
    int value = *((int *)argv);
    printf("From thread process ...\n");
    printf("Thread value: %d\n", value);

    // 3.1
    pthread_exit(NULL);
}

// Launch thread
pthread_t launch_thread(void) {
    input += 1;
    pthread_t tid;
    pthread_attr_t tattr;

    pthread_attr_init(&tattr);
    pthread_create(&tid, &tattr, myfunc, &input);

    // 3.2
    return tid;
}

// main
int main(void) {
    // 3.3
    pthread_t tid = launch_thread();

    // Wait for thread to finish
    pthread_join(tid, NULL);

    printf("From main process ...\n");

    return 0; // always good practice
}

