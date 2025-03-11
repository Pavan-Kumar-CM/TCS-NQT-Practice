// Q. Implement the Binary Search

package TCS_NQT.Searching;
import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size!");
            return;
        }

        System.out.println("Enter sorted array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = input.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
    public static int binarySearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
