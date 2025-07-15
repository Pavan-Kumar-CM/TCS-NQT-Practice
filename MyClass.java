package TCS_NQT;
import java.util.*;
class MyClass
{
    public static void main(String[] args) { // 195

        int[] nums = {1, 2, 3, 4, 5};
        int[] num2 = {1, 9, 4};

        int res = find(num2);
        System.out.println(res);

    }
    public static int find(int[] nums)
    {
        int sum = 0;
        int pro = 1;

        for(int num : nums)
        {
            sum += num;
            pro *= num;
        }

        if(sum % 2 != 0)
        {
            return pro;
        }
        return sum;
    }
}
