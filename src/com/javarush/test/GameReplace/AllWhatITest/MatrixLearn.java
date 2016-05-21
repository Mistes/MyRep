package com.javarush.test.GameReplace.AllWhatITest;

/**
 * Created by Mistes on 21.05.2016.
 */
public class MatrixLearn
{
    public static void main(String[] args)
    {
        int[][] multiplyTab  = new int[6][6];

        // цикл по первой размерности
        for (int i = 0; i < 6; i++) {
            // цикл по второй размерности
            for (int j = 0; j < 6; j++) {
                //инициализация элементов массива

                multiplyTab[i][j] =((int) (Math.random() * 100))*((int) (Math.random() * 100));

                //вывод элементов массива
                System.out.print(multiplyTab[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
