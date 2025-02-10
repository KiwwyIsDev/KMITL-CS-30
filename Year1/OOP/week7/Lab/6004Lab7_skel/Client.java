import packMembership.*;

public class Client implements CanPay {

    private String name;
    private MemberTypeWithDiscount memberType;

    Client(String name) {
        this.name = name;
        memberType = MemberTypeWithDiscount.NONE;
    }

    private void promoteMemberType(){
        switch (memberType) {
            case NONE -> memberType = MemberTypeWithDiscount.SILVER;
            case SILVER -> memberType = MemberTypeWithDiscount.GOLD;
            case GOLD -> memberType = MemberTypeWithDiscount.PREMIUM;
            default -> {}
        }
        showMembershipStatus();
    }

    private void demoteMemberType(){
        switch (memberType) {
            case GOLD -> memberType = MemberTypeWithDiscount.SILVER;
            case PREMIUM -> memberType = MemberTypeWithDiscount.GOLD;
            default -> {}
        }
        showMembershipStatus();
    }

    public void showMembershipStatus(){
        System.out.printf("%s is now %s %d%% Discount on Product %d%% Discount on Service%n",
            name, memberType, (int)(memberType.getProductDiscount()*100), (int)(memberType.getServiceDiscount()*100));
    }

    @Override
    public void spend(int dir) {
        if (dir > 0) {
            promoteMemberType();
        } else {
            demoteMemberType();
        }
    }
}
