package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileReader {

    public static final String FILENAME = "src/main/resources/result.txt";


    public Map<List<String>, List<String>> answers =new TreeMap<>();
    // List<String> players = new ArrayList<>();
    // List<String> answers = new ArrayList<>();
    String correctAnswers;


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


                    answers.put(new ArrayList<>(Arrays.asList(s[0])), new ArrayList<>(Arrays.asList(s[1])));
                    System.out.println(answers);

                }
            }

        }

    catch(
    IOException ise)

    {
        throw new IllegalStateException("Can't read file!", ise);
    }
}



}
