import java.util.*;

public class Palindrome_check_leet1{


    //check for a palindrome number 
    public static boolean check_palindrome(int num){
        int reverse = 0;
        int org_num = num;
        while(num != 0){
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num/10;
        }

        if(org_num == reverse){
            return true;
        }
        return false;
    };

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome : -- ");
        int num = sc.nextInt();
        String result = check_palindrome(num)? "It is a palindrome" : "It is not a palindrome";
        System.out.println(result);
        sc.close();
    }
}