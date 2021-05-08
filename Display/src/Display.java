import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("* * * * * * *");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        int noOfSpaces = (5 - i);
                        for (int j = 0; j <noOfSpaces; j++) {
                            System.out.print(" ");
                        }
                        int noOfStars = (i * 2) + 1;
                        for (int z = 0; z < noOfStars; z++) {
                            System.out.print("*");
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }
}

