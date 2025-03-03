package TCS_NQT.Arrays;

import java.util.*;
public class FrequencyCount
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size =  input.nextInt();
        int[] arr = new int[size];

        if(size <= 0)
        {
            System.out.println("Invalid array size!");
            return;
        }
        System.out.println("Enter array elements:");
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = input.nextInt();
        }

        countFrequency(arr);
    }
    public static void countFrequency(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num) + 1);
            }
            else
            {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


//        map.forEach(
//                (k, v) ->
//            {
//                System.out.println("Key " + k + ", Value" + v);
//            }
//        );
    }
}
