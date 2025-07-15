package TCS_NQT;

import java.util.Arrays;

import static TCS_NQT.BSort.swap;

public class InSort {
    public static void main(String[] args) {

        int[] nums = {6, 5, 9, 1, 7, 0};

        int len = nums.length;

        for(int  i = 0;i < len - 1;i++)
        {
            for(int j = i + 1;j > 0;j--)
            {
                if(nums[j] < nums[j - 1]){
                    swap(nums, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
