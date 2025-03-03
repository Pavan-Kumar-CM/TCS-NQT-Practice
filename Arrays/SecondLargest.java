package TCS_NQT.Arrays;

import java.util.Scanner;

public class SecondLargest {
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
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        int result = findSecondLargest(arr);
        if(result == -1)
        {
            System.out.println("No second Largest element found in Given Array");
        }
        else
        {
            System.out.println("Second Largest Element is: " + result);
        }
    }
    public static int findSecondLargest(int[] arr)
    {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num > max_1)
            {
                max_2 = max_1;
                max_1 = num;
            }
            else if(num < max_1 && num > max_2)
            {
                max_2 = num;
            }
        }

        return (max_2 == Integer.MIN_VALUE) ? -1 : max_2;
    }
}
