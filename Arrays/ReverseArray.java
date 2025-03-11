// Q. Reverse The Array

package TCS_NQT.Arrays;

import java.util.*;
public class ReverseArray {
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
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = input.nextInt();
        }
        reverseArray(arr);
        System.out.println("Reversed Array is : " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
