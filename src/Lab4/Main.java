package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1, s2, s3;
        String color;
        boolean filledTriangle = false;

        System.out.print("Side 1/ Side 2/ Side 3: ");
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        s3 = input.nextDouble();
        System.out.println("What color would you like to fill? ");
        color = input.next();

    }
}
