public class Solidrombus {

    public static void Rombus(int n){
        for(int i=1; i<=n;i++){
            //space
            for(int j=1 ; j<=(n-i);j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            //for space
            for(int j=1 ;j<=(i-1);j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        Rombus(15);

    }
}
