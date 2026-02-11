import java.io.*;
import java.util.*;

public class FileHandler {
    public void generateRandomNumbers(String fileName, int count) throws IOException {
        Random rand = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < count; i++) {
                writer.println(rand.nextInt(10000)); // Aqui tenemos numeros hasta 10,000
            }
        }
    }
    public Integer[] readNumbers(String fileName, int limit) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < limit && scanner.hasNextInt(); i++) {
                list.add(scanner.nextInt());
            }
        }
        return list.toArray(new Integer[0]);
    }
}