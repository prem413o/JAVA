import java.util.*;

public class Prime {

    public static boolean Checkprime(int n){
        boolean is_prime=true;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                is_prime=false;
            }
        }
        return is_prime;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n=sc.nextInt();

        System.out.println("select the given number is prime then (yes or no) "+Checkprime(n));
        sc.close();
    }
}
