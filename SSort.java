package TCS_NQT;

import java.util.Arrays;

public class SSort {
    public static void main(String[] args)
    {
        int[] nums = {6, 5, 9, 1, 7, 0};

        int len = nums.length;

        for(int i = 0;i < len;i++)
        {
            int key = i;
            for(int j = i + 1;j < len;j++)
            {
                if(nums[key] > nums[j])
                {
                    key = j;
                }
            }

            swap(nums,i,key);
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] arr, int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
