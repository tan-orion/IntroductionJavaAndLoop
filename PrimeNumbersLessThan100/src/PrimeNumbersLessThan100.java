public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {

        for (int num =2 ;num<100;num++){
            boolean check=true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    check=false;
                            break;
                }
            }
            if (check){
                System.out.println(num);
            }
        }
    }
}
