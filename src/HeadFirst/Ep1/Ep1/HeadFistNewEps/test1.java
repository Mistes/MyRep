package HeadFirst.Ep1.Ep1.HeadFistNewEps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 19.04.2016.
 */
public class test1
 {


    public static int ArmorChooseer()
    {
        int complect = 0;
        try
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Choose your armor: 1==leather---2==mail-----3==plate");

                while (true)
                {
                    int value = Integer.parseInt(reader.readLine());
                    if (value == 1)
                    {
                        complect = 1;
                        System.out.println("You choose leather");
                        break;
                    }
                    if (value == 2)
                    {
                        complect = 2;
                        System.out.println("You choose mail");
                        break;
                    }
                    if (value == 3)
                    {
                        complect = 3;
                        System.out.println("You choose plate");
                        break;
                    }
                }

            }
            catch (Exception e)
            {
                System.out.println("EXCEPTION IN READER MOTHERFUCKER");
            }
            return complect;
        }
    }



