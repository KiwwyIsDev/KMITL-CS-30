package Association_AccessCard;
public class AccessCard {
    private String titleCard;
    private String cardDetail;

    public AccessCard(String titleCard, String cardDetail) {
        this.titleCard = titleCard;
        this.cardDetail = cardDetail;
    }

    @Override
    public String toString() {
        return titleCard +  " "  + cardDetail;
    }
}
