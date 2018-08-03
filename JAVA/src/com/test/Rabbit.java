package com.test;

import java.util.ArrayList;
/**
 * Demo class
 *
 * @author Kengo Omi
 * @date 8/2/2018
 */

public class Rabbit {

    public static void main(String[] args)
    {
        int rabbitsNum = 1;
        int months = 36;
        for (int i = 0; i < (months/3); i++)
        {
            rabbitsNum += rabbitsNum;
        }
        System.out.println(rabbitsNum);
    }
}
