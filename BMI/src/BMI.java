import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height,weitgh,bmi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight");
        weitgh=sc.nextDouble();
        System.out.println("Enter height");
        height=sc.nextDouble();
        bmi=weitgh/(Math.pow(height,2));

        if (bmi <18.5){
            System.out.println("You are very thin");
        }else  if (( bmi >=18.5)&& (bmi< 25.0)){
            System.out.println("You are normal");
        }else  if((bmi >=25.0)&&(bmi<30.0)){
            System.out.println("You are a bit fat");
        }else if( bmi>30.0){
            System.out.println("You are very very fat");
        }

    }
}
