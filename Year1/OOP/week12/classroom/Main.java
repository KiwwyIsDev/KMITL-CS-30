import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        q8_flatMap();
    }
        
    public static void q8_flatMap() {
        List < String > teamA = Arrays.asList("yindee");
        List < String > teamB = Arrays.asList("preeda", "pramote");
        List < String > teamC = Arrays.asList("sukha");
        List < List < String >> allTeams = new ArrayList < >();
        allTeams.add(teamA);
        allTeams.add(teamB);
        allTeams.add(teamC);
        List < String > allPlayers = allTeams.stream().flatMap(team -> team.stream()).collect(Collectors.toList());
        System.out.println(allPlayers);
    }      
}