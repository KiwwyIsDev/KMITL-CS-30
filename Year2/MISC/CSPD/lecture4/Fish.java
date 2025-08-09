public class Fish extends Animal {
    private int coin = 0;

    Fish(int age, String gender) {
        super(age, gender);
    }

    @Override
    public boolean isMammal() {
        return false;
    } 

    @Override
    public void eat() {
        System.out.println("eating coin");
        int newCoin = coin + givecoin();
        setCoin(newCoin);
        System.out.println("Now I have: " + getCoin() + " coins.");
    }

    public int givecoin() {
        return (int)(Math.random() * 10);
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}