package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код fgdfgdfgdfdfgfdgfdgdfg
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        int r = 0;
        for (int i = 0; i < n; i++) {
            r = console.nextInt();
            multiArray[i] = new int[r];
            //System.out.println(multiArray[i][0]);
        }

        //for (int i = 0; i < multiArray.length; i++) {
        //System.out.println(multiArray[i][]);
        //}

    }
}
