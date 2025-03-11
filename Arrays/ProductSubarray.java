// Q. Find Maximum Product Subarray in an Array

package TCS_NQT.Arrays;

import java.util.*;
public class ProductSubarray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        int ans = findMaxProduct(arr,size);
        System.out.println("Max Product Of Given Array is : " + ans);

    }
    public static int findMaxProduct(int[] arr,int size)
    {
        int pref = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < size;i++)
        {
            if(pref == 0) pref = 1;
            if(suf == 0) suf = 1;

            pref *= arr[i];
            suf *= arr[size - i - 1];

            max = Math.max(max, Math.max(pref,suf));
        }
        return max;
    }
}
