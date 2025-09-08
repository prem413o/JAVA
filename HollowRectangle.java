public class HollowRectangle{

    public static void Pattern(int totalrow,int totlcoln){

        for(int i=1 ; i<=totalrow ;i++){
            for(int j=1 ;j<=totlcoln;j++){
                if(i==1 || i==totalrow || j==1 || j==totlcoln){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Pattern(4,5);

    }
}