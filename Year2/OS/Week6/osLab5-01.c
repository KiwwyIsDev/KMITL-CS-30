#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
void main () {
	printf("#1 P_PID: %d", getpid());
	pid_t id = fork();
	if (id == 0) {
		printf("#2 C_PID: %d", getpid());
		printf("#3 P_PID: %d", getppid());
		sleep(0);
		// exit(0);
} else {
		printf("#4 P_PID: %d", getpid());
		printf("#5 C_PID: %d", id);
		sleep(0);
	}
	printf("HELLO CS KMITL");
}
