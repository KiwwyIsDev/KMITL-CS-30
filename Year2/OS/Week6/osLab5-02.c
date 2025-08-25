#include <stdio.h>
#include <unistd.h>

void main() {
	printf("PID: %d\n", getpid());
	printf("HELLO ...\n");
	execlp("echo", "echo", "... CS\n... KMITL", NULL);
}
