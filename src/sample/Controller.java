package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class Controller {
    public ImageView quizImage;
    public ListView possibleAnswers;
    public TextField usersAnswer;
    public Label Score;
    public Label feedback;
    Image[] images;
    String[] answers;
    String correctAnswer;

    public void initialize() {
        images = new Image[21];
        images[0] = new Image("sample/Pictures/Bulbasaur.png");
        images[1] = new Image("sample/Pictures/Charmander.png");
        images[2] = new Image("sample/Pictures/Squirtle.png");
        images[3] = new Image("sample/Pictures/Chikorita.png");
        images[4] = new Image("sample/Pictures/Cyndaquil.png");
        images[5] = new Image("sample/Pictures/Totodile.png");
        images[6] = new Image("sample/Pictures/Treecko.png");
        images[7] = new Image("sample/Pictures/Torchic.png");
        images[8] = new Image("sample/Pictures/Mudkip.png");
        images[9] = new Image("sample/Pictures/Turtwig.png");
        images[10] = new Image("sample/Pictures/Chimchar.png");
        images[11] = new Image("sample/Pictures/Piplup.png");
        images[12] = new Image("sample/Pictures/Snivy.png");
        images[13] = new Image("sample/Pictures/Tepig.png");
        images[14] = new Image("sample/Pictures/Oshawott.png");
        images[15] = new Image("sample/Pictures/Chespin.png");
        images[16] = new Image("sample/Pictures/Fennekin.png");
        images[17] = new Image("sample/Pictures/Froakie.png");
        images[18] = new Image("sample/Pictures/Rowlet.png");
        images[19] = new Image("sample/Pictures/Popplio.png");
        images[20] = new Image("sample/Pictures/Litten.png");

        answers = new String[21];
        answers[0] = "Bulbasaur";
        answers[1] = "Charmander";
        answers[2] = "Squirtle";
        answers[3] = "Chikorita";
        answers[4] = "Cyndaquil";
        answers[5] = "Totodile";
        answers[6] = "Treecko";
        answers[7] = "Torchic";
        answers[8] = "Mudkip";
        answers[9] = "Turtwig";
        answers[10] = "Chimchar";
        answers[11] = "Piplup";
        answers[12] = "Snivy";
        answers[13] = "Tepig";
        answers[14] = "Oshawott";
        answers[15] = "Chespin";
        answers[16] = "Fennekin";
        answers[17] = "Froakie";
        answers[18] = "Rowlet";
        answers[19] = "Popplio";
        answers[20] = "Litten";


        Random rand = new Random();
        int imageNum = rand.nextInt(20);

        quizImage.setImage(images[imageNum]);

        correctAnswer = answers[imageNum];
        int incorrectNum1 = rand.nextInt(20);
        int incorrectNum2 = rand.nextInt(20);
        String bogusAnswer1 =answers[incorrectNum1];
        String bogusAnswer2 =answers[incorrectNum2];



        // update PossibleAnswers with 1 correct option and 3 incorrect options
        possibleAnswers.getItems().add(correctAnswer);
        possibleAnswers.getItems().add(bogusAnswer1);
        possibleAnswers.getItems().add(bogusAnswer2);


    }

    public void userAnswered() {
        String usersAnswerText = usersAnswer.getText();

        if (usersAnswerText.equals(correctAnswer)) {
            feedback.setText("Correct it was " + correctAnswer);


        } else {

            feedback.setText("Nope it was " + correctAnswer);

        }




        Random rand = new Random();
        int imageNum = rand.nextInt(20);

        quizImage.setImage(images[imageNum]);

        correctAnswer = answers[imageNum];
        int incorrectNum1 = rand.nextInt(20);
        int incorrectNum2 = rand.nextInt(20);
        String bogusAnswer1 =answers[incorrectNum1];
        String bogusAnswer2 =answers[incorrectNum2];


        // update PossibleAnswers with 1 correct option and 3 incorrect options
        possibleAnswers.getItems().clear();
        possibleAnswers.getItems().add(correctAnswer);
        possibleAnswers.getItems().add(bogusAnswer1);
        possibleAnswers.getItems().add(bogusAnswer2);
    }

    public void userScore() {
    //String score = 0 + ();

    }
}
