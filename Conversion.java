public class Conversion{

    public static int Binarytodecimal(int n){
        int decimal=0;
        int r;
        int m=0;
        while(n>0){
            
            r=(n % 10);
            
            decimal=decimal +r*(int)Math.pow(2,m);;
            m=m+1;
            n=n / 10;

        }
        return decimal;
    }

    public static void main(String args[]){
        int n=1000;
        System.out.print(Binarytodecimal(n));

    }
}