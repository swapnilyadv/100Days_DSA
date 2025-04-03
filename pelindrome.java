public class pelindrome {
    public static void main(String[] args) {
        // String str = "madam";
        // boolean isPalindrome = true;

        // for (int i = 0; i < str.length() / 2; i++) {
        //     if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        //         isPalindrome = false;
        //         break;
        //     }
        // }

        // if (isPalindrome) {
        //     System.out.println(str + " is a palindrome.");
        // } else {
        //     System.out.println(str + " is not a palindrome.");
        // }

        int x = 121;
        if (x < 0) {
            System.out.println(x + " is not a palindrome.");
            return;
        }
        int n = x;
        int rev = 0;

        while (n>0){
            int d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        if (rev == x) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }

    }
}