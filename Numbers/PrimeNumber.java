// Q. Check if a number is prime or not

package TCS_NQT.Numbers;

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        boolean ans = isPrime(n);

        if(ans)
        {
            System.out.println(n + " is a Prime Number");
        }
        else
        {
            System.out.println(n + " is Not a Palindrome Number");
        }
    }
    public static boolean isPrime(int num)
    {
        if(num <= 1) return false;

        for(int i = 2;i <= Math.sqrt(num);i++)
        {
            if(num % i == 0) return false;
        }

        return true;
    }
}
