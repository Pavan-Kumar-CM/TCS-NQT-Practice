// Q. Adding Element in an Array

package TCS_NQT.Arrays;

import java.util.*;
public class AddElement {
    public static void insertToBeginning(int[] arr,int val,int size)
    {
        for(int i = size - 2;i >= 0;i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[0] = val;
        System.out.println(Arrays.toString(arr));
    }

    public static void insertToEnd(int[] arr,int val,int size)
    {
        arr[size - 1] = val;

        System.out.println(Arrays.toString(arr));
    }

    public static void insertToPosition(int[] arr,int val,int size,int pos)
    {
        for(int i = size - 1;i >= pos;i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = val;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);

        System.out.print("\n 1.Insert At Beginning\n 2.Insert At End\n 3.Insert At Position\n");
        System.out.print("Enter The Choice: ");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.print("Enter array size: ");
                int bSize = input.nextInt();
                int[] begin = new int[bSize];
                System.out.println("Enter array elements:");
                for (int i = 0; i < bSize; i++) {
                    begin[i] = input.nextInt();
                }
                System.out.print("Enter Value to Insert:");
                int val1 = input.nextInt();
                insertToBeginning(begin, val1, bSize);

                break;
            }

            case 2:
            {
                System.out.print("Enter array size: ");
                int eSize = input.nextInt();
                int[] end = new int[eSize];
                System.out.println("Enter array elements:");
                for (int i = 0; i < eSize; i++) {
                    end[i] = input.nextInt();
                }
                System.out.print("Enter Value to Insert:");
                int val2 = input.nextInt();
                insertToEnd(end, val2, eSize);

                break;
            }

            case 3:
            {
                System.out.print("Enter array size: ");
                int mSize = input.nextInt();
                int[] mid = new int[mSize];
                System.out.println("Enter array elements:");
                for (int i = 0; i < mSize; i++) {
                    mid[i] = input.nextInt();
                }

                System.out.print("Enter Value to Insert:");
                int val3 = input.nextInt();
                System.out.print("Enter Position To Inset The Given Value:");
                int pos = input.nextInt();
                insertToPosition(mid, val3, mSize, pos);
                break;
            }
        }
    }
}
