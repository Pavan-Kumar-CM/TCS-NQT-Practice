package TCS_NQT.Arrays;

import java.util.*;
public class RearrangeTheArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
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

        rearrange(arr);
    }
    public static void rearrange(int[] arr)
    {
        Arrays.sort(arr);
        int len = arr.length;

        for(int i = 0;i < len / 2; i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int j = len - 1;j >= len / 2;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
