public class Main {
    public static void main(String[] args) {
        System.out.println("Capi");
        Capybara capi = new Capybara(3, "male");
        capi.eat();
        System.out.println();

        System.out.println("Bird");
        Bird jib = new Bird(4, "female");
        jib.stealmoney(10);
        jib.stealmoney(20);
        System.out.println();

        
        System.out.println("Fish");
        Fish pla = new Fish(5, "male");
        pla.eat();
        pla.eat();
        pla.eat();


    }
}
