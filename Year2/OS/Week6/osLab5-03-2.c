#include <stdio.h>

void main(int argc, char *argv[]) {
	printf("HELLO ...\n... %s\n", argv[2]);
	printf("PID: %d\n", getpid());
}
