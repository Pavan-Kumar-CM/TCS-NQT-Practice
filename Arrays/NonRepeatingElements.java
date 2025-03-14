// Q . Find The NON - Repeating Element in an Array

package TCS_NQT.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingElements {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        findNonRepeatingElement(arr);
    }
    public static void findNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int num : arr) {
            if (set.get(num) == null) {
                set.put(num, 1);
            } else {
                set.put(num, set.get(num) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : set.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println(entry.getKey());
            }
        }

//        set.forEach
//                (
//                        (k,v) ->
//                        {
//                            if(v == 1)
//                            {
//                                System.out.println(k);
//                            }
//                        }
//                );
    }
}
