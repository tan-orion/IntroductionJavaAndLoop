import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số thứ nhất");
        int num1 = sc.nextInt();
        System.out.println("nhập số thứ 2 ");
        int num2=sc.nextInt();
        int gcd=1;
        for (int i= 1;i<=num1&& i <=num2;i++){
            if (num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        System.out.println("ước chung lớn nhất của :"+num1+"và"+num2+"là:"+gcd);
    }
}
