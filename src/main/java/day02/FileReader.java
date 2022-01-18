package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileReader {

    public static final String FILENAME = "src/main/resources/result.txt";


    public Map<String, List<String>> answers = new TreeMap<>();
    // public List<String> players = new ArrayList<>();
    // List<String> answers = new ArrayList<>();
    public String correctAnswers;


    public void readFile(Path p) throws IllegalStateException {
        try {
            List<String> lines = Files.readAllLines(p);
            int counter = 0;
            for (String line : lines) {
                if (counter == 0) {
                    correctAnswers = line;
                    System.out.println(correctAnswers);
                    counter = 1;
                } else {

                    String s[] = line.split(" ");
                    if (!answers.containsKey(s[0])) answers.put(s[0], new ArrayList<>());
                    answers.get(s[0]).add(s[1]);
                    System.out.println(answers);

                }
            }

        } catch (
                IOException ise) {
            throw new IllegalStateException("Can't read file!", ise);
        }
    }


}
