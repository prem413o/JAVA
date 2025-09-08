

public class Half{

    public static void NumberinvertedPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                System.out.print(j);
            }
            for(int j=1 ; j<=i ;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){

        NumberinvertedPattern(5);

    }
}