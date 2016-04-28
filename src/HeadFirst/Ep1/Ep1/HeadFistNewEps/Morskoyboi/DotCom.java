package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

import java.util.ArrayList;

/**
 * Created by ������������� on 25.04.2016.
 */
public class DotCom
{
    private ArrayList<String> locationCells;
    private String name;
    int numOfHits = 0;
    public void SetLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public void setName (String n){
        name = n;
    }
    public String checkYourself(String userInput){
        String result = "You missed!";
        int index = locationCells.indexOf(userInput);
        if(index >=0)
        {
            locationCells.remove(index);
            if (locationCells.isEmpty())
            {
                result = "Sink!";
                System.out.println("Ouch! You sink " + name + " : ( ");
            } else
            {
                result = "Hit!";
            }

        }return result;



    }
}
