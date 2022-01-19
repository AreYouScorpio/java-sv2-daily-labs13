package day02;

import java.util.List;
import java.util.Map;



public class GetAnswer {

    FileReader fileReader;

    GetAnswer(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public String getAnswer(String player, int whichQuestion) {
        char[] correctAnswerArray = fileReader.correctAnswers.toCharArray();

        System.out.println(correctAnswerArray[whichQuestion - 1]);

        if ((fileReader.answers.get(player).get(whichQuestion - 1)).charAt(0) == correctAnswerArray[whichQuestion - 1])
            System.out.println("Jó válasz");
        else System.out.println("Rossz válasz.");

        return fileReader.answers.get(player).get(whichQuestion - 1);

    }

    public void whoIsTheWinner() {



        char[] correctAnswerArray = fileReader.correctAnswers.toCharArray();

        for (Map.Entry<String, List<String>> actual : fileReader.answers.entrySet()) {

            int points=0;

            for (int j = 1; j < 6; j++) {


                    if ((fileReader.answers.get(actual).get(j - 1)).charAt(0) == correctAnswerArray[j - 1])

                    {points++;
                System.out.println(fileReader.answers.get(actual).get(j-1).charAt(0));
                    System.out.println(points);}
                else points-=2;



            }
        }


    }
}
