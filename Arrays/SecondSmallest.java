package TCS_NQT.Arrays;

import java.util.Scanner;

public class SecondSmallest {
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

        int result = findSecondSmallest(arr);
        if(result == -1)
        {
            System.out.println("No second smallest element found in Given Array");
        }
        else
        {
            System.out.println("Second Smallest Element is: " + result);
        }
    }
    public static int findSecondSmallest(int[] arr)
    {
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        for(int num : arr)
        {
            if(num < min_1)
            {
                min_2 = min_1;
                min_1 = num;
            }
            else if(num > min_1 && num < min_2)
            {
                min_2 = num;
            }
        }

        return (min_2 == Integer.MAX_VALUE) ? -1 : min_2;
    }
}
