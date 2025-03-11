// Q. Rotate array by K elements

package TCS_NQT.Arrays;
import java.util.*;

public class RotateKElements
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size =  input.nextInt();
        int[] arr1 = new int[size];

        if(size <= 0)
        {
            System.out.println("Invalid array size!");
            return;
        }
        System.out.println("Enter array elements:");
        for(int i = 0;i < arr1.length;i++)
        {
            arr1[i] = input.nextInt();
        }

        int k = input.nextInt();

        rotateRight(arr1,k);
        System.out.println("Right Rotate Array is : "+ Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr2,k);
        System.out.println("Left Rotated Array is : " + Arrays.toString(arr2));
    }

    public static void rotateRight(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        swap(arr, 0, n - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);
    }

    public static void rotateLeft(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);
        swap(arr, 0, n - 1);
    }
    public static void swap(int[] arr, int s, int e)
    {
        while (s < e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
