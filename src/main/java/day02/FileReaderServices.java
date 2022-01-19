package day02;

import java.net.URI;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static day02.FileReader.FILENAME;

public class FileReaderServices {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile(Path.of(FILENAME));
        GetAnswer getAnswer = new GetAnswer(fileReader);

        System.out.println(fileReader.answers);
        System.out.println(getAnswer.getAnswer("AB123", 2));

        getAnswer.whoIsTheWinner();

    }


}
