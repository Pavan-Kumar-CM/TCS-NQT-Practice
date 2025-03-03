package TCS_NQT.Arrays;

import java.util.stream.*;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size  = input.nextInt();
        int[] arr = new int[size];

        if(size <= 0)
        {
            System.out.println("Invalid array size!");
            return;
        }
        System.out.println("Enter array elements:");
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }
        int result = findSum(arr);

        System.out.println("Sum of Array Element is: " + result);
        System.out.println("Using Array Stream : " + IntStream.of(arr).sum());
    }
    public static int findSum(int[] arr)
    {
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }

        return sum;
    }
}
