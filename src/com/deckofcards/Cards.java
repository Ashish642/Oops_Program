package com.deckofcards;
import java.util.Random;

public class Cards {
    public static  String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
    public static String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public static int CARD = 9;
    public static int PLAYER =4;
    public static String[][] Playercard = new String[4][9];

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];


    }

}
