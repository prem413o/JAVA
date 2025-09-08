public class conv {

    public static void Decitobin(int n){
        
        int pow=0;
        int r;
        int bin=0;
        while(n>0){
            r=n % 2;

            bin=bin +r*(int)Math.pow(10, pow);
            pow++;

            n=n/2;

        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        Decitobin(7);

    }
}
