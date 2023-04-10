package ss8_clean_code_to_java.exercise;

import java.util.Arrays;
import java.util.Collection;

public class TennisGameTest {
    public static void main(String[] args) {
        TennisGame tennis = new TennisGame();
        System.out.println("The Game On is :" + TennisGame.getScore("Jhon", "Marry", 5,
                4));

    }
}
