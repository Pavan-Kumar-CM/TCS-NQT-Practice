// Q. Find all Palindrome Numbers in a given range

package TCS_NQT.Numbers;

import java.util.*;
public class PalindromeRange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int min = input.nextInt();
        int max = input.nextInt();

        for(int i = min;i <= max;i++)
        {
            if(isPalindrome(i))
            {
                System.out.println(i + " ");
            }
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
