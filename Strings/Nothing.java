package TCS_NQT.Strings;

import java.util.*;
public class Nothing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fNew = input.nextInt();
        int fDeno = input.nextInt();

        int sNew = input.nextInt();
        int sDeno = input.nextInt();

        int lcm = (fDeno + sDeno) / gcd(fDeno, sDeno);

        int sumNum = (fNew * (lcm / fDeno) + (sNew * (lcm / sDeno)));
        int sumDeno = lcm;

        int commDiv = gcd(sumNum, sumDeno);

        sumNum /= commDiv;
        sumDeno /= commDiv;

    }

    public static int gcd(int a,int b)
    {
        while(a > 0 && b > 0)
        {

            if(a > b)
            {
                a %= b;
            }
            else
            {
                b %= a;
            }
        }
        return (a == 0) ? b : a;



    }
}
