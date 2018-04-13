import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("g2.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                System.out.println(Arrays.deepToString(Utils.parseGraph(line)));
            }
        }
    }
}