import java.time.Clock;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int j = 1; j < 100; j++) {
            System.out.println(getCard());
            Thread.sleep(23, 23);
        }
        ArrayList sum = new ArrayList();
//isBlackjack(sum);

    }


    public static String getCard() {
        long number;
        Clock clock = Clock.systemDefaultZone();
        long miliSeconds = clock.millis();
        number = miliSeconds % 13;
        switch ((int) number) {
            case 0 : return "2";
            case 1 : return "3";
            case 2 : return "4";
            case 3 : return "5";
            case 4 : return "6";
            case 5 : return "7";
            case 6 : return "8";
            case 7 : return "9";
            case 8 : return "10";
            case 9 : return "J";
            case 10 : return "Q";
            case 11 : return "K";
            case 12 : return "A";
            default: return "-1";
        }
    }
    public static int CardToValue(String card) {
        switch (card) {
            case "2" : return 2;
            case "3" : return 3;
            case "4" : return 4;
            case "5" : return 5;
            case "6" : return 6;
            case "7" : return 7;
            case "8" : return 8;
            case "9" : return 9;
            case "10" : case "K" : case "J" : case "Q" : return 10;
            case "A" : return 0;
            default: return -1;
        }
    }

    /*public static boolean isBlackjack (ArrayList sum) {
        for (int i = 0; i < sum.size(); i++) {

        }
    */
    }
