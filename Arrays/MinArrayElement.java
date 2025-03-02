// Q. Find the smallest number in an array
package TCS_NQT.Arrays;

import java.util.*;
public class MinArrayElement {
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

        int result = findSmallest(arr);
        System.out.println("Minimum Array Element is: " + result);
        input.close();
    }

    private static int findSmallest(int[] arr) { //O(n)
        int min = Integer.MAX_VALUE;
        for(int num : arr)
        {
            if(num < min) min = num;
        }
        return min;
    }
}
