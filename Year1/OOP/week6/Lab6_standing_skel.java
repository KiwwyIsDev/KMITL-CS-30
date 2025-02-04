import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lab6_standing { 
        // phy chem bio math stat com kdai
    static String [] names = {"phy", "chem", "bio", "math", "stat", "com", "kdai"};
    static ArrayList<String> name_lis = new ArrayList<>(Arrays.asList(names));
    static String [] matches = new String[21];
    static String results_str = "1:2 ,2:0 ,0:0 ,0:1 ,1:2 ,2:2 ,3:2 ,0:1 ,3:3 ,3:0 ,2:0 ,1:0 ,1:0 ,2:3 ,0:0 ,3:1 ,0:0 ,1:2 ,0:0 ,1:0 ,1:0";
    static String [] results = results_str.split(",");
    static final int WIN = 3;
    static final int LOSE = 0;
    static final int DRAW = 1;
    static {
        matches[0] = "phy vs. chem";    matches[1] = "phy vs. bio";      matches[2] = "phy vs. math";    matches[3] = "phy vs. stat";
        matches[4] = "phy vs. com";     matches[5] = "phy vs. kdai";
        matches[6] = "chem vs. bio";    matches[7] = "chem vs. math";   matches[8] = "chem vs. stat";   matches[9] = "chem vs. com";
        matches[10] = "chem vs. kdai";
        matches[11] = "bio vs. math";   matches[12] = "bio vs. stat";   matches[13] = "bio vs. com";    matches[14] = "bio vs. kdai";
        matches[15] = "math vs. stat";  matches[16] = "math vs. com";   matches[17] = "math vs. kdai";
        matches[18] = "stat vs. com";   matches[19] = "stat vs. kdai";  matches[20] = "com vs. kdai"; 
        for (int i = 0; i < matches.length; i++) {
            System.out.println("i= " + i + " " + matches[i]);
        }
    }
    static void byList1() {
        ArrayList<Team> lis = new ArrayList<>();
        for (int i = 0; i < names.length; i++)
            lis.add(new Team(names[i]));
        
        int i = 0, j = 0, match_num = 0;   
        String [] scores;
        int score1, score2;
        Team team1, team2;        
        // extract team1, team2 and team1's score team2's score from []matches and []results
        for (match_num = 0; match_num < matches.length; match_num++) {
            String [] team = matches[match_num].split(" vs. ");
            i = name_lis.indexOf(team[0]);
            j = name_lis.indexOf(team[1]);
            team1 = lis.get(i);
            team2 = lis.get(j);
            scores = results[match_num].trim().split(":");
            score1 = Integer.parseInt(scores[0]);
            score2 = Integer.parseInt(scores[1]);            
            if (score1 > score2) {
                team1.accumulate_match_stat(score1, score2, WIN);
                team2.accumulate_match_stat(score2, score1, LOSE);
            } else if (score1 == score2) {
                team1.accumulate_match_stat(score1, score2, DRAW);
                team2.accumulate_match_stat(score2, score1, DRAW);
            } else {
                /* your code 2 */
            }
            // sout only dept. com matches
            if (team[0].equals("com") || team[1].equals("com")) {
                System.out.println(team[0] + " vs. " + team[1] + "\t" + score1 + ":" + score2);
            }
        }
        Comparator<Team> engine = new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                /* your code 3 */
                return 0;
            }
        };
        Collections.sort(lis, engine);
        Collections.reverse(lis);
        for (Team t : lis) {
            System.out.println(t);
        }            
    }
    public static void main(String[] args) {
        byList1();   
    }
}
class Team {
    String dept;
    int num_games;
    int goal_for;
    int goal_against;
    int points;
    public Team(String d) {
        dept = d;
    }
    public String getName() {
        return dept;
    }
    public int getGoalsFor() {
        return goal_for;
    }
    public int getGoalsDiff() {
        return goal_for - goal_against;
    }
    public int getPoints() {
        return points;
    }
    void accumulate_match_stat(int gf, int ga, int p) {
        /* your code 1 */
    }
    public String toString() {
        return dept + "\t" + num_games + "\t" + goal_for 
                + "\t" + goal_against + "\t\t" + points; 
    }
}
