package Association_AccessCard;
public class Main {
    public static void main(String[] args) {
        AccessCard ac1 = new AccessCard("Love mom", "i love mom so much");
        Card c1 = new Card("Kiwwy", ac1);

        c1.showCard();
    }
}
