import java.util.*;

public class Funct {

    public static int Sumofdigit(int n){
        int sum=0;
        while(n>0){
            int r=n % 10;
            sum=sum +r;
            
            n=n/10;

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n=sc.nextInt();

        System.out.print(Sumofdigit(n));
        sc.close();

    }
}
