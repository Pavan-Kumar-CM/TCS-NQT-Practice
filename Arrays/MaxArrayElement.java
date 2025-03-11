//  Q. Find the largest number in an array

package TCS_NQT.Arrays;

import java.util.*;

public class MaxArrayElement
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if(size <= 0)
        {
            System.out.println("Invalid array size!");
            return;
        }

        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        int result = findLargest(arr);
        System.out.println("Maximum Array Element is: " + result);
        input.close();
    }

    public static int findLargest(int[] arr) { // O(n)
        int max = Integer.MIN_VALUE;
        for(int num : arr)
        {
            if(num > max) max = num;
        }
        return max;
    }
}
