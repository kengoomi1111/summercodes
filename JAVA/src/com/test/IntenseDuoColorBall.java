package com.test;

import java.util.Scanner;

/**
 * IntenseDuoColorBall class
 *
 * @author Kengo Omi
 * @date 8/2/2018
 */

public class IntenseDuoColorBall extends DuoColorBall {

    int[] boughtBlue = new int[6];
    int boughtRed = 0;

    public void buys(int blue1, int blue2, int blue3, int blue4, int blue5, int blue6, int red1)
    {
        boughtBlue[0] = blue1;
        boughtBlue[1] = blue2;
        boughtBlue[2] = blue3;
        boughtBlue[3] = blue4;
        boughtBlue[4] = blue5;
        boughtBlue[5] = blue6;
        boughtRed = red1;
    }

    public int checkMatchTime(int[] boughtBlue, int[] blueBalls, int boughtRed, int redBalls)
    {
        int count = 0;
        for (int i = 0; i <= boughtBlue.length-1; i++)
        {
            for (int j = 0; j <= blueBalls.length-1; j++)
            {
                if (boughtBlue[i] == blueBalls[j])
                {
                    count += 1;
                }
            }
        }
        if (boughtRed == redBalls)
        {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] prices = {0,0,0,0};
        Scanner times = new Scanner(System.in);
        System.out.println("How many times do you want to buy?");
        int cycle = times.nextInt();
        for (int i = 1; i <= cycle; i++)
        {
            IntenseDuoColorBall its = new IntenseDuoColorBall();
            int[] blueBalls = its.getBlue();
            int redBall = its.getRed();
            its.buys(8,7,9,6,10,11,8);
            int matched = its.checkMatchTime(its.boughtBlue,blueBalls,its.boughtRed,redBall);
            System.out.println("You have "+ matched + " matching balls");
            switch (matched){
                case 7:
                    prices[0] += 1;
                    break;
                case 4:
                    prices[1] += 1;
                    break;
                case 3:
                    prices[2] += 1;
                    break;
                case 1:
                    prices[3] += 1;
                    break;
            }

        }
        System.out.println("You won " + prices[0] + " first prices");
        System.out.println("You won " + prices[1] + " second prices");
        System.out.println("You won " + prices[2] + " third prices");
        System.out.println("You won " + prices[3] + " lucky prices");
    }
}
