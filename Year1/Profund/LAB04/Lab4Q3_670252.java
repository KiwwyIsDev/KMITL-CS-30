import java.util.Scanner;

public class Lab4Q3_670252 {
  public static void main(String[] args) {
    Scanner park = new Scanner(System.in);
    String hour = park.nextLine();
    String[] hour_check = hour.split(" ");
    int total = 0;
    for (String hours_check : hour_check) {
      int check = Integer.parseInt(hours_check);
      int remain_hour = check % 24; // create remain_hour
      int remain_money = 0;

      if (check <= 2) {
        total = 4;
      } else if (check <= 4) {
        total = 4 + (3 * (check - 2)); // correct
      } else if (check <= 24) { // change <= 24
        total = 10 + (check - 4); // 4 + 3*2 + check - 4 * 1
        if (check >= 18) {
          total = 24;
        }
      } else {
        total = 24 * (check / 24);
      }

      if (check > 24 && remain_hour > 0) {
        // int check_full = check % 24; have remain_hour
        if (remain_hour <= 2) {
          remain_money = remain_money + 4;
        } else if (remain_hour <= 4) {
          remain_money = (remain_money + 4 + (3 * (remain_hour - 2)));
        } else if (remain_hour <= 24) {
          remain_money = remain_money + 10 + (remain_hour - 4);
          if (check >= 18) {
            remain_money = 24;
          }
        } else {
          remain_money = remain_money + 24;
        }
      }
      System.out.printf("parking for %d hrs, pay %d baht.\n", check, total + remain_money);
      park.close();
    }
  }
}
