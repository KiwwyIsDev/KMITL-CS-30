public class Bird extends Animal {
    private int money = 0;

    public Bird(int age, String gender) {
        super(age, gender);
    }

    @Override
    public boolean isMammal() {
        return false;
    }

    public void stealmoney(int money) {
        int newMoney = this.money + money;
        setMoney(newMoney);
        System.out.println("I have $" + getMoney());
    }

    public int getMoney() { 
        return money;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }

}