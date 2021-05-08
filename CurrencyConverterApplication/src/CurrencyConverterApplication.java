import java.util.Scanner;

public class CurrencyConverterApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double vnd=23000;
        double usd;
        System.out.println("enter usd");
        usd=sc.nextDouble();
        double rate = usd*vnd;
        System.out.println("Value in VND is :" +rate );
    }
}
