import packMembership.*;

public class MembershipMain {
    static void q_1() {
        int [] monthly = {1,1,1,1,1,-1,-1,1,-1};
        Customer yindee = new Customer("Yindee");
        int i = 0;
        for (; i < monthly.length; i++) {
            yindee.spend(monthly[i]);
        }
    }
    static void q_2() {
        int [] monthly = {1,1,1,1,1,-1,-1,1,-1};
        Client preeda = new Client("preeda");
        int i = 0;
        for (; i < monthly.length; i++) {
            preeda.spend(monthly[i]);
        }
    }
    public static void main(String[] args) {
        // q_1();
        q_2();
    }
}
