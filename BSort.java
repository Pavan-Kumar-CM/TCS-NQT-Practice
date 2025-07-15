package TCS_NQT;

import java.util.Arrays;

public class BSort {
    public static void main(String[] args)
    {
        int[] nums = {6, 5, 9, 1, 7, 0};

        int len = nums.length;
        for(int i = 0;i < len;i++)
        {
            for(int j = 0; j < len - 1 - i;j++)
            {
                if(nums[j + 1] < nums[j])
                {
                    swap(nums,j + 1,j);
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i,int j)
    {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];

    }

    public static class MergeSort {
        public static void main(String[] args) {

        }
    }
}
