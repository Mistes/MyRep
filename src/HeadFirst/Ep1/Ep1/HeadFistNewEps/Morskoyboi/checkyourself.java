package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

/**
 * Created by Администратор on 25.04.2016.
 */
public class checkyourself
{
    int[]locationCells;
    int numOfHits = 0;
    public void SetLocationCells(int [] haha){
        locationCells = haha;
    }
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "In the sea";
        for(int cell : locationCells){
            if(guess ==cell){
                result = "Hit!";
                numOfHits++;
                break;
            }
        }
        if(numOfHits ==locationCells.length){
            result = "Sink!";
        }
        System.out.println(result);
        return result;

    }
}
