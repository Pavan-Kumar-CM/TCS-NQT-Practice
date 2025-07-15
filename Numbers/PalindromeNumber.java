// Q. Check if a number is Palindrome or Not

package TCS_NQT.Numbers;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        boolean ans = isPalindrome(n);

        if(ans)
        {
            System.out.println(n + " is a Palindrome Number");
        }
        else
        {
            System.out.println(n + " is Not a Palindrome Number");
        }
    }
    public static boolean isPalindrome(int num)
    {
        int checkNum = num;
        int sum = 0;
        while(num > 0)
        {
            int rem = num % 10;
            sum = sum *  10 + rem;
            num /= 10;
        }

        return sum == checkNum;
    }
}
