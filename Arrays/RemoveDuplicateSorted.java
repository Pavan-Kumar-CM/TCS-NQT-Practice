// Q. Remove Duplicate Form the Sorted Array

package TCS_NQT.Arrays;

import java.util.*;
public class RemoveDuplicateSorted
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
        System.out.println("Enter Sorted array elements:");
        int[] arr = new int[size];
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] arr)
    {
        Set<Integer> set = new TreeSet<>();

        for(int num : arr)
        {
            set.add(num);
        }
        System.out.print("After Removing Duplicates Element Sorted Array : " + set);
    }
}
