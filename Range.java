import java.util.*;

public class Range{

    public static void Printprime(int n){
        for(int i=2;i<=n;i++){
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    continue;
                }else{
                    System.out.print(i);
                }
            }
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the range last digit : ");
        int n=sc.nextInt();
        Printprime(n);
    }
}