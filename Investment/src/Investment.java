import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
// số tiền lãi= số tiền gửi * tỉ lệ lãi suất(%năm)/12 *số tháng gửi
        double money;
        int month;
        double interset_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment money :");
        money= sc.nextDouble();
        System.out.println("Enter number of months:");
        month=sc.nextInt();
        System.out.println("Enter annual interest rate in percetage");
        interset_rate= sc.nextDouble();
        double total_interest=0;
        for (int i =0;i<month;i++){
            total_interest+=money*(interset_rate/100)/12*month;
        }
        System.out.println("total of interest:"+total_interest);
    }
}
