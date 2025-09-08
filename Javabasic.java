public class Javabasic{

    public static int factoiral(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int BinomialCoefficent(int n,int r){
        int n_fact=factoiral(n);
        int r_fact=factoiral(r);
        int n_r_fact=factoiral(n-r);

        int result=n_fact/(r_fact*n_r_fact);
        return result;
    }

    public static void main(String args[]){
        int n=5;
        int r=2;

        System.out.println(BinomialCoefficent(n, r));

    }
}