package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

//import java.util.Scanner;

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        //Scanner console = new Scanner(System.in);
        //multiArray[0] = new int[1][]; // {{4, 8, 15}, {16}}
        //multiArray[1] = new int[1][]; // {16}}, {{23, 42}, {}}
        //multiArray[2] = new int[3][]; // {{1}, {2}, {3}, {4, 5}}}
        // multiArray = new int[3][4][5];
        for (int i = 0; i < multiArray.length; i++) { // multiArray.length = 2 (because 0, 1, 2)
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }
    }
}
