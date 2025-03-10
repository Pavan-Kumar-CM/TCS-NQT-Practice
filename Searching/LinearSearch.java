package TCS_NQT.Searching;
import java.util.*;

public class LinearSearch
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int size = input.nextInt();

            if (size <= 0)
            {
                System.out.println("Invalid array size!");
                return;
            }

            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++)
            {
                arr[i] = input.nextInt();
            }

            System.out.print("Enter target element: ");
            int target = input.nextInt();

            int index = linearSearch(arr, target);
            if (index != -1)
            {
                System.out.println("Element found at index: " + index);
            } else
            {
                System.out.println("Element Not Found");
            }
    }

    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
