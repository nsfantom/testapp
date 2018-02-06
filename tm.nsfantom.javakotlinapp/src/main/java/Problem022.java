import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Using names.txt (right click and 'Save Link/Target As...'),
    a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
    Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

    For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
    is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

    What is the total of all the name scores in the file?
 */
public final class Problem022 {

    private static List<Character> characterList;

    public static void main(String[] args) {
        characterList = initArray();
        List<String> names = initNames();
        names.add(0, "0"); // init index 0
        long time = System.nanoTime();
        long sum = names.stream().map(s -> getScore(s.toCharArray()) * names.indexOf(s)).mapToLong(i -> i).sum();
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum);
    }

    private static long getScore(char[] chars) {
        long sum = 0;
        for (char c : chars) sum += characterList.indexOf(c);
        return sum;
    }

    private static List<Character> initArray() {
        List<Character> a = new ArrayList<>();
        a.add('0'); // init index 0
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) a.add(alphabet);
        return a;
    }

    private static List<String> initNames() {
        List<String> a = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(System.getProperty("user.dir").concat("/tm.nsfantom.javakotlinapp/").concat("p022_names.txt")), "UTF-8"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] fields = line.split(",");
                Arrays.stream(fields).forEach(s -> a.add(s.replace("\"", "")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return a.stream().sorted().collect(Collectors.toList());
    }
}
