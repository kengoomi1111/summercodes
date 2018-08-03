package com.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * DuoColorBall class
 *
 * @author Kengo Omi
 * @date 8/2/2018
 */

public class DuoColorBall {

    int[] blueBalls = getBlue();
    int redBall = getRed();

    public void printBlue(int[] getBlue)
    {
        System.out.println("Blue balls are: ");
        for (int i : getBlue)
        {
            System.out.println(i);
        }
    }

    public void printRed(int redBall)
    {
        System.out.println("Red ball is:");
        System.out.println(redBall);
    }

    public int[] getBlue()
    {
        Random ranint = new Random();
        int[] blues = new int[6];
        ArrayList<Integer> blueInit = new ArrayList<>();
        for (int i = 1; i <= 33; i++)
        {
            blueInit.add(i);
        }
        for (int k = 0; k <= 5; k ++){
            int randindex = ranint.nextInt(blueInit.size());
            blues[k] = blueInit.get(randindex);
            blueInit.remove(randindex);
        }
        return blues;
    }

    public int getRed()
    {
        Random random = new Random();
        return random.nextInt(16)+1;
    }

    public static void main(String[] args)
    {
        DuoColorBall ball = new DuoColorBall();
        ball.printBlue(ball.getBlue());
        ball.printRed(ball.getRed());
    }
}
