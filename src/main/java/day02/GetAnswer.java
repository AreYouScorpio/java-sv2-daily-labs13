package day02;

public class GetAnswer {

    FileReader fileReader;

    GetAnswer(FileReader fileReader)
    {
        this.fileReader=fileReader;
    }

    public String getAnswer(String player, int whichQuestion) {
        char[] correctAnswerArray = fileReader.correctAnswers.toCharArray();
        System.out.println(correctAnswerArray[whichQuestion - 1]);
        if ((fileReader.answers.get(player).get(whichQuestion - 1)).charAt(0) == correctAnswerArray[whichQuestion - 1])
            System.out.println("Jó válasz");
        else System.out.println("Rossz válasz.");

        return fileReader.answers.get(player).get(whichQuestion - 1);

    }


}
