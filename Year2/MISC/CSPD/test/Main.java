class Main {

    static void method1() {
        System.out.println("Method 1 callee");
    }

    // static void recursive(int i) {
    //     if (i == 0) return;

    //     System.out.println(i);
    //     method1();

    //     recursive(i - 1);
    // }

    public static void main(String[] args) {
        method1();
    }
}