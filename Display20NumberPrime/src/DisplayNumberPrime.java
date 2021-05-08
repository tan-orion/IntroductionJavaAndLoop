import java.util.Scanner;

public class DisplayNumberPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number prime to display:");
        int num = sc.nextInt();
        int count = 0;
        String result= "";
       int N =2;
        while (count < num) {
            int countDivisible=0;
            for (int i =1 ;i <=Math.sqrt(N);i++){
                if (N%i==0){
                    countDivisible++;
                }
            }
            if(countDivisible==1){
                result+=N+" ";
                count++;
            }
            N++;
        }
        System.out.println(result);
    }
}
