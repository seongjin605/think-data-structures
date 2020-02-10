import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> comp = new ArrayList<Integer>(); //Alice와 Bob의 득점 list를 초기화함
        //initialize list which Alice's and Bob's score is in
        comp.add(0); //Alice의 득점 부분 (Alice's score)
        comp.add(0); //Bob의 득점 부분 (Bob's score)

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) { //if Alice wins Bob
                comp.set(0, comp.get(0) + 1);
            } else if (a.get(i) < b.get(i)) { //if Bob wins Alice
                comp.set(1, comp.get(1) + 1);
            }
        }

        return comp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
