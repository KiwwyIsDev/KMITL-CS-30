class Dog {
    String name;
    int age;

    void speak() {
        System.out.println(name + " is talking to you");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.speak(); // null is talking to you
        
        mydog.name = "Jod";
        mydog.speak(); // Jod is talking to you

        mydog.age = 3;
        System.out.printf("Hi I'm %s %d years old", mydog.name, mydog.age);
        // Hi I'm Jod 3 years old
    }
}
