package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 25.04.2016.
 */
public class main
{
    public static void main(String[] args)
    {
        int numberOfGueses = 0;
        GameHelper helper = new GameHelper();
        checkyourself check = new checkyourself();
        int rand = (int)(Math.random()*5+1);
        int[]locations ={rand, rand+1,rand+2};
        check.SetLocationCells(locations);
        boolean isalive = true;
        while(isalive = true){
        }
        String guess = helper.getUserInput("Input int");
        System.out.println(guess);
        String result = check.checkYourself(guess);
        numberOfGueses++;
        if(result.equals("Sink!")){
            isalive = false;
            System.out.println("Вам потребовалось "+ numberOfGueses + " trys");
        }


    }
}
