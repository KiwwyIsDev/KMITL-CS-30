package packMembership;

public class Customer implements CanPay {
    private String name;
    private MemberType memberType;
    public Customer(String n) {
        name = n;
        memberType = memberType.NONE;
    }
    private void promoteMemberType() {
        if (memberType == MemberType.NONE)
            memberType = MemberType.SILVER;
        else if (memberType == MemberType.SILVER)
            memberType = MemberType.GOLD;
        else if (memberType == MemberType.GOLD)
            memberType = MemberType.PREMIUM;
            showMemberStatus();
    }
    private void demoteMemberType() {
        if (memberType == MemberType.PREMIUM)
            memberType = MemberType.GOLD;
        else if (memberType == MemberType.GOLD)
            memberType = MemberType.SILVER;
        showMemberStatus();
    }
    public void showMemberStatus() {
        System.out.println(name + " is now " + memberType);
    }
    public void spend(int dir) {
        if (dir > 0) {
            promoteMemberType();
            return;
        } 
        demoteMemberType();
    }
}
