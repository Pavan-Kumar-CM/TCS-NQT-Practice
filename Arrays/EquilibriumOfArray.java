package TCS_NQT.Arrays;
import java.util.*;
import java.util.Scanner;

public class EquilibriumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int res = findEquilibrium(arr,size);
        if (res == -1)
        {
            System.out.println("Unable to Find Equilibrium For Given Array" + Arrays.toString(arr));
        }
        else
        {
            System.out.println("Found At Index: " + res);
        }
    }

    public static int findEquilibrium(int[] nums,int size)
    {
        int sum = 0;
        int leftSum = 0;

        for(int num : nums)
        {
            sum += num;
        }

        int len = nums.length;
        for(int i = 0;i < len;i++)
        {
            sum -= nums[i];

            if(leftSum == sum) return i;

            leftSum += nums[i];
        }
        return -1;
    }
}
