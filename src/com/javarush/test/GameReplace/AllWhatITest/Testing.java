package com.javarush.test.GameReplace.AllWhatITest;

/**
 * Created by Mistes on 12.06.2016.
 */
public class Testing
{
    public static void main(String[] args)
    {
        int min = 0;
        int[] array = new int[]{-99,1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        for (int i = 0; i < array.length; i++){

            if(min > array[i]){
                min = array[i];
            }
            //else array[i] = min;
        }
        System.out.println(min);

    }
}
