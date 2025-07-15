package TCS_NQT.Strings;
import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG {
    public static void main(String[] args) {
        /*package whatever //do not write package name here */
                Scanner input = new Scanner(System.in);

                int t = input.nextInt();
                for(int i = 0;i < t;i++)
                {

                    int size = input.nextInt();


                    LinkedHashSet<Integer> set = new LinkedHashSet<>();


                    for(int j = 0;j < size;j++)
                    {
                        set.add(input.nextInt());
                    }

                    for(int nu : set)
                    {
                        System.out.print(nu+" ");
                    }
                    System.out.println();
                }
    }
}
