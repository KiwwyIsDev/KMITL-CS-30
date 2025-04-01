import java.util.Scanner;

enum ElevatorState {
	IDLE, MOVE_UP, MOVE_DOWN, DOORS_OPEN
}

public class ElevatorFSA {
	private int Floor;
	private ElevatorState State;

	public ElevatorFSA() {
		this.Floor = 1;
		this.State = ElevatorState.IDLE;
	}

	public void To(int targetF) {
		if (targetF == Floor) {
			System.out.println("You are already on floor " + Floor);
			openDoors();
			return;
		}

		if (targetF > Floor) {
			changeState(ElevatorState.MOVE_UP);
			moveUp(targetF);
		} else {
			changeState(ElevatorState.MOVE_DOWN);
			moveDown(targetF);
		}

		openDoors();
	}

	private void moveUp(int targetF) {
		while (Floor < targetF) {
			Floor++;
			System.out.println("Moving up... Now on floor " + Floor);
		}
		changeState(ElevatorState.IDLE);
	}

	private void moveDown(int targetF) {
		while (Floor > targetF) {
			Floor--;
			System.out.println("Moving down... Now on floor " + Floor);
		}
		changeState(ElevatorState.IDLE);
	}

	private void openDoors() {
		changeState(ElevatorState.DOORS_OPEN);
		System.out.println("Doors opening...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doors closing...");
		changeState(ElevatorState.IDLE);
	}

	private void changeState(ElevatorState state) {
		this.State = state;
		System.out.println("Elevator State changed to: " + State);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ElevatorFSA elevator = new ElevatorFSA();

		while (true) {
			System.out.print("Enter target floor (or -1 to exit): ");
			int floor = scanner.nextInt();
			if (floor < -1 || floor == 0)
			{
				break;
			}
			if (floor == -1) break;
			elevator.To(floor);
			System.out.println();
		}
		scanner.close();
	}
}
