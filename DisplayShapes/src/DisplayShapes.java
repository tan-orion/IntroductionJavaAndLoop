import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1 . Draw the rectangle");
        System.out.println("2 . Draw the square triangle");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("4. Draw inverted triangle");
        System.out.println("0. exit");

        while (true){
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    for(int i = 0 ; i<3; i++){
                        System.out.println( "* * * * * *");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 3 :
                    System.out.println("Draw isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <(5-i); j++) {
                            System.out.print(" ");
                        }
                        int Stars = (i * 2) + 1;
                        for (int z = 0; z < Stars; z++) {
                            System.out.print("*");
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 4:
                        System.out.println(" Draw inverted triangle");
                    for (int i = 6; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No Choice!");
                    break;
            }
        }
    }
}
