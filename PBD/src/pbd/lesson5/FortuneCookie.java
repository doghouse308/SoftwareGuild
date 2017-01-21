package pbd.lesson5;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class FortuneCookie {

    public static void main(String[] args) {

        Random r = new Random();
        int number;
        String[] fortune = {"A friend asks only for your time not your money.",
            "If you refuse to accept anything but the best, you very often get it.",
            "A smile is your passport into the hearts of others.",
            "Hard work pays off in the future, laziness pays off now.",
            "People are naturally attracted to you.",
            "A chance meeting opens new doors to success and friendship.",
            "If you have something good in your life, don't let it go!",
            "What ever you're goal is in life, embrace it visualize it, and for it will be yours.",
            "Meeting adversity well is the source of your strength.",
            "There is no greater pleasure than seeing your loved ones prosper."};
        System.out.println("The fortune cookie says:");
        System.out.println(fortune[((1 + r.nextInt(10)) - 1)]);
        System.out.print("\t");
        for (int i = 0; i < 6; i++){
            System.out.print(1 + r.nextInt(54));
            if (i < 5) {
                System.out.print(" - ");
            }
        }
        System.out.println("");
    }

}
