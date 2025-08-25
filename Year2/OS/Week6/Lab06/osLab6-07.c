#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

int msum = 0;

void *runner(void *param) {
    int upper = atoi(param);
    int *csum = (int *)malloc(sizeof(int));
    *csum = 0;

    for (int i = 1; i <= upper; i++) {
        *csum += i;
    }

    printf("From thread process ...\n");
    pthread_exit((void *)csum);
}

int main(int argc, char *argv[]) {
    pthread_t tid;
    void *retval;

    if (argc != 2) {
        fprintf(stderr, "Usage: %s <positive integer>\n", argv[0]);
        return 1;
    }

    int n = atoi(argv[1]);
    if (n <= 0) {
        fprintf(stderr, "Input must be a positive integer\n");
        return 1;
    }

    pthread_create(&tid, NULL, runner, argv[1]);

    for (int i = 1; i <= n / 2; i++) {
        msum += i;
    }

    printf("From main process ...\n");

    pthread_join(tid, &retval);

    int csum = *((int *)retval);
    free(retval);

    printf("csum = %d\n", csum);
    printf("msum = %d\n", msum);
    printf("Difference csum and msum = %d\n", csum - msum);

    return 0;
}

