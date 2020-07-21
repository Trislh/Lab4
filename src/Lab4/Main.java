package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1, s2, s3;
        String color;
        String filledTriangle;

        System.out.print("Side 1/ Side 2/ Side 3: ");
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        s3 = input.nextDouble();
        Triangle triAngle = new Triangle(s1,s2,s3);
        System.out.println("What color would you like to fill? ");
        color = input.next();
        triAngle.setColor(color);
        System.out.println("Do you want it to be filled?(Y/N) ");
        filledTriangle = input.next();
        if(filledTriangle.equals("Y")) {
            triAngle.setFilled(true);
        } else {
            System.out.println("Not filled!");
        }

        System.out.println(triAngle.toString());
        System.out.println("Color: " + triAngle.getColor());
        System.out.println("Area: " + triAngle.getArea() + "\nPerimeter: " + triAngle.getPerimeter());
        System.out.println("Is the Triangle filled? " + triAngle.isFilled());


    }
}
