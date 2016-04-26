package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 25.04.2016.
 */
public class GameHelper
{
    public String getUserInput(String promt){
        String inputline = null;
        System.out.println(promt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
            if(inputline.length() == 0){return null;}
        }catch (IOException e){
            System.out.println("IOException " + e);
        }
        return inputline;
    }
}
