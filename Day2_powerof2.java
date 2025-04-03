public class Day2_powerof2{
    public static void main (String[] arg){
        int n =16;
        if (n<1){
            System.out.println(n + " is not a power of 2.");
            return;
        }
        else if (n == 1){
            System.out.println(n + " is a power of 2.");
            return;
        }
        else{
            while(n>1){
                if (n%2 != 0){
                    System.out.println(n + " is not a power of 2.");
                    return;
                }
                n = n/2;
            }
            if (n == 1){
                System.out.println(n + " is a power of 2.");
            }
            else{
                System.out.println(n + " is not a power of 2.");
            }
        }
    }
}