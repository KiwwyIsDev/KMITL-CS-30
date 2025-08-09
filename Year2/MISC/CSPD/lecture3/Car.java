public class Car extends Vehicle {

    public Car(String name, String keyword) {
        super(name, keyword);
    }
    
    @Override
    public void move(){
        System.out.println(name + " car class is saying");
    }

}
