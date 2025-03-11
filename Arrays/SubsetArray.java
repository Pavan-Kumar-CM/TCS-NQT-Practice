//Q. Check if array is subset of another array

package TCS_NQT.Arrays;

import java.util.*;
public class SubsetArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size1 = input.nextInt();
        int size2 = input.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for(int i = 0;i < size1;i++)
        {
            arr1[i] = input.nextInt();
        }
        for(int j = 0;j < size2;j++)
        {
            arr2[j] = input.nextInt();
        }

        boolean ans = isSubset(arr1, arr2, size1, size2);
        if(ans)
        {
            System.out.println("arr1[] is subset of arr2[]");
        }
        else
        {
            System.out.println("arr1[] is not a subset of arr2[]");
        }
    }
    public static boolean isSubset(int[] arr1,int[] arr2, int size1,int size2)
    {
        if(size1 > size2) return false;

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0;i < size2;i++)
        {
            map.put(arr2[i], true);
        }

        for(int num : arr1)
        {
            if(map.containsKey(num) == false) return false;
        }
        return true;
    }
}
