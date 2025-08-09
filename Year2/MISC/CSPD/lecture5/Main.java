class Animal {
    int secret = 88;
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    int secret = 99;
    
    @Override
    public void eat() {
        System.out.println("Dog is eating bone.");
    }

    public void wow() {
        System.out.println("WOW");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.eat();
        System.out.println(dog.secret);
        Dog dogwow = (Dog)dog;
        dogwow.wow();
        System.out.println(dogwow.secret);

        Animal dogagain = dogwow;
        System.out.println(dogagain.secret);
        

        cat.eat();
        bird.eat();
    }
}
