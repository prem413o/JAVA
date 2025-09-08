import java.util.*;

public class Reversenumber {
    public static int Reverse(int n){
        int rev=0;

        while(n>0){
            int r=n % 10;
            rev=rev*10 +r;
            n=n/10;
        }
        return rev;
    }
    public static boolean Checkpalidrome(int n){
        int result=Reverse(n);

        if(result==n){
            return true;
        }
        
        return false;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        
       System.out.print( Checkpalidrome(n));
       sc.close();

    }
}
