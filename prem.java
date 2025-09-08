public class prem{

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void Printprime(int n){
        for(int i=2;i<=n;i++){
            boolean result=isprime(i);
            if(result==true){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]){
        
        Printprime(100);

    }
}