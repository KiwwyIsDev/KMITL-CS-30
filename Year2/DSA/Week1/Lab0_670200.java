import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab0_670200 {
    public static void main(String[] args) {
        demo_1();
    }

    public static List<int[]> mergeBeams(List<int[]> beams) {
        List<int[]> sorted = new ArrayList<>();
        for (int[] x : beams) {
            if (x[1] < x[0]) {
                sorted.add(new int[] { x[0], x[1] + 360 });
            } else {
                sorted.add(new int[] { x[0], x[1] });
            }
        }
        Collections.sort(sorted, (a, b) -> Integer.compare(a[0], b[0]));

        // System.out.println("SORTED");
        // for (var x : sorted)
        // {
        //     System.out.println(Arrays.toString(x));
        // }
        System.out.println();
        int n = sorted.size();
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sorted.get(i)[0]; // 70
            int end = sorted.get(i)[1]; // 100

            if (!result.isEmpty() && result.get(result.size() - 1)[1] >= end) // 420 >= 100 ? "merged" : "go merge ja"
            {
                // System.out.printf("skip %d >= %d\n", result.get(result.size() - 1)[1], end);
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (sorted.get(j)[0] <= end) {
                    // System.out.printf("condi: true %d <= %d\n", sorted.get(j)[0], end);
                    end = Math.max(end, sorted.get(j)[1]);
                }
                // System.out.printf("at %d %d ; start : %d end : %d\n", i, j, start, end);

            }
            result.add(new int[] { start, end });

        }

        return result;
    }

    static void demo_1() {
        // int[] data = {10, 90, 70, 100, 150, 210};
        // int[] data = {70, 100, 150, 100, 160, 185, 360, 60};
        // int[] data = {10, 210, 210, 10};
        // int[] data = {20, 20};
        int[] data = {1, 100, 90, 95};

        List<int[]> beams = new ArrayList<>();
        for (int i = 0; i < 2 * (data.length / 2); i += 2) {
            beams.add(new int[] { data[i], data[i + 1] });
        }
        List<int[]> merged = mergeBeams(beams);
        for (int[] beam : merged) {
            System.out.println(Arrays.toString(beam));
        }
    }

}
