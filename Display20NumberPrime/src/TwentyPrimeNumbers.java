import java.util.Scanner;

public class TwentyPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số lượng cần hiện thị:");
        int num =sc.nextInt();
        int N = 2;
        String result ="";
        int count = 0;
        while(count<num){
            boolean check= true;
            for (int i =2;i <=Math.sqrt(N);i++){
                if(N%i == 0){
                    check=false;
                    break;

                }
            }
            if(check){
                result += N + " ";
                count++;
            }
            N++;
        }
        System.out.println(result);

    }
}
