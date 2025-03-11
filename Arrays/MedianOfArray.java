// Q. Find The Median of Given Array

package TCS_NQT.Arrays;

import java.util.*;
public class MedianOfArray {
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

        double result = findMedian(arr, size);
        System.out.println("Median of Given Array is : " + result);
    }
    public static double findMedian(int[] arr,int n)
    {
        Arrays.sort(arr);

        if(n % 2 != 0)
        {
            return arr[n / 2];
        }

        return (double) (arr[(n / 2) - 1] + arr[n / 2])  / 2;
    }
}
