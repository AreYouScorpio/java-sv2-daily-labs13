package day02;

import java.net.URI;
import java.nio.file.Path;

import static day02.FileReader.FILENAME;

public class FileReaderServices {


    public static void main(String[] args) {


        FileReader fileReader = new FileReader();
        fileReader.readFile(Path.of(FILENAME));


    }


}
