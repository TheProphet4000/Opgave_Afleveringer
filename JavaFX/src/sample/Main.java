package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CardGameUI.fxml"));
        primaryStage.setTitle("Romaines game");
        primaryStage.setScene(new Scene(root, 640, 400));
        primaryStage.show();
    }

    public String print(String chatter){
        return (chatter + "\n");
    } //retunere text med linjeskift


    public static void main(String[] args) {
        launch(args);
        gameStart();
    }

    private static void gameStart() {
        System.out.println("--------------------------Game Startet-----------------------------------");
        System.out.println("Hello there my name Romaine, so you wanna play a card game?");
        System.out.println("It's a simple game about life and death");
        System.out.println(" ");
        System.out.println("Okay let's play a simple game, i shuffle the cards and you pick one");
        cardGame();
    }

    private static void cardGame() {

        //------------------------find Random card-----------------
        int cardmin = 1, cardmax = 13;
        int suitmin = 1, suitmax = 4;
        String cardname, suitname;

        int card = (int) (Math.random() * (cardmax - cardmin + 1) + cardmin);
        int suit = (int) (Math.random() * (suitmax - suitmin + 1) + suitmin);

        //------------------generate Cards-------------------------
        if (card == 1) {
            cardname = "Ace";
        } else if (card == 11) {
            cardname = "Jack";
        } else if (card == 12) {
            cardname = "Queen";
        } else if (card == 13) {
            cardname = "King";
        } else {
            cardname = String.valueOf(card);
        }

        if (suit == 1) {
            suitname = "Diamonds";
        } else if (suit == 2) {
            suitname = "Clubs";
        } else if (suit == 3) {
            suitname = "Hearts";
        } else {
            suitname = "Spades";
        }

        System.out.println("What card from 1 to 13 do you want to take off my hand?");

        Scanner input = new Scanner(System.in);
        int pickedcard = input.nextInt(); //simulere at brugeren trækkede et kort, selvom det ikke gør noget i sidste ende

        System.out.println("So you picked card number " + pickedcard + " I'll now show you the card");
        System.out.println(" ");
        System.out.println("The card is " + cardname + " of " + suitname + " Is this your lucky card?");

        Scanner okay = new Scanner(System.in);
        String choise = okay.nextLine();

        if (choise.equals("yes")) {
            if (card < 6){ lose(); }
            else{ win(); }
        }
        else {
            cardGame();
        }

    }

    private static void win() {
        System.out.println("Heyyy your lucky card saved you, enjoy the time you have left!");
        System.out.println(" --------------------------You Won!----------------------------------- ");
    }

    private static void lose() {
        System.out.println("Aww to bad, your lucky card didn't have enough luck... i have to silence you");
        System.out.println(" --------------------------GameOver----------------------------------- ");
        gameStart();
    }

}

