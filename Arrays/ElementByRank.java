package TCS_NQT.Arrays;

import java.util.*;
public class ElementByRank {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i < size;i++)
        {
            arr[i] = input.nextInt();
        }

        findElementRank(arr,size);
    }
    public static void findElementRank(int[] arr,int size)
    {
        int[] dum = new int[size];
        for(int i = 0;i < size;i++)
        {
            dum[i] = arr[i];
        }
        Arrays.sort(dum);

        HashMap<Integer,Integer> map = new HashMap<>();

        int temp = 1;
        for(int i = 0;i < size;i++)
        {
            if(map.get(dum[i]) == null)
            {
                map.put(dum[i],temp++);
            }
        }

        for(int j = 0;j < size;j++)
        {
            System.out.print(map.get(arr[j]) + " ");
        }
    }
}
