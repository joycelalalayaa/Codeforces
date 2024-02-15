import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // final double KilogramsPerPound = 0.4536;

        // double pounds = -1;

        // while (pounds < 0) {
        // System.out.print("enter a number in pounds: ");

        // if (input.hasNextDouble()) {
        // pounds = input.nextDouble();
        // if (pounds < 0) {
        // System.out.print("please enter a positive number, ");
        // } else {

        // double kilograms = pounds * KilogramsPerPound;

        // System.out.println(pounds + "pounds is equal to " + kilograms + "
        // kilograms");
        // }
        // } else {
        // System.out.println("please enter a valid number");
        // input.next();
        // }

        // }

        Double joyce = input.nextDouble();
        String joyce2 = input.next();

        System.out.printf("joyce just typed: %f + %s \n", joyce, joyce2);

        System.out.println("joyce just typed: " + joyce + " + " + joyce2);
    }
}
