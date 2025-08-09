public abstract class Calculator {
    public static final double PI = 3.14159; // const

    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);

    // concrete method
    public void printPI() { 
        System.out.println(PI);
    }
}