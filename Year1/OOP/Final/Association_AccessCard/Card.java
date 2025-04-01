package Association_AccessCard;
public class Card {
    private String ownCard;
    private AccessCard accessCard;

    public Card(String ownCard, AccessCard accessCard) {
        this.ownCard = ownCard;
        this.accessCard = accessCard;

    }

    public void showCard() { 
        System.out.println("OwnCard: " + ownCard);
        System.out.println("Detail " +  accessCard.toString());
    }

}
