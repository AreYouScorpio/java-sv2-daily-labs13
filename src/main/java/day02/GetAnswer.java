package day02;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


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

        Map<String, Integer> winnerList = new TreeMap<>();

        String winner = "";

        for (Map.Entry<String, List<String>> actual : fileReader.answers.entrySet()) {

            int points=0;

            for (int j = 1; j < 6; j++) {


                if ((actual.getValue().get(j - 1)).charAt(0) == 'X') points+=0;
                if ((actual.getValue().get(j - 1)).charAt(0) == correctAnswerArray[j - 1])  points+=j;
                if ((!((actual.getValue().get(j - 1)).charAt(0) == correctAnswerArray[j - 1]))&&(!((actual.getValue().get(j - 1)).charAt(0) == 'X'))) points-=2;
                System.out.println(j + ". kör a ciklusban" + points);



            }
            System.out.println(actual.getKey());
            System.out.println(actual.getValue());
            System.out.println(points);
            winnerList.put(actual.getKey(), points);
            System.out.println(winnerList);


            }

        int max=-11110;
        for (Map.Entry<String, Integer> actualWinner : winnerList.entrySet()) {
            if (actualWinner.getValue()>max) {
                max=actualWinner.getValue();
                winner=actualWinner.getKey();
                System.out.println(winner);
            }
        }
        System.out.println("winner points: " + max);
        System.out.println("winner is: "+ winner);

        }


    }

