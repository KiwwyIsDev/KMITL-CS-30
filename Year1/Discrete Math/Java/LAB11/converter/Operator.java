package converter;

public class Operator {
    public static int getPriority(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static boolean isLeftToRight(char operator) {
        return operator != '^';
    }
}
