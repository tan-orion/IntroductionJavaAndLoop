import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num<2){
            System.out.println("number is not isPrime");
        }else {
            int i=2;
            boolean check=true;
            while (i <=Math.sqrt(num)){
                if(num%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(num+""+"is a Prime");
            }else{
                System.out.println(num +"is not a prime");
            }

    }
}}
