package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DotComBust
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numberOfGueses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go4win.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("You need to sink 3 sites");
        System.out.println("Try to do it for a minimum steps");
        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.SetLocationCells(newLocation);
        }

    }
    private void startPlaying(){
        while(!dotComsList.isEmpty()){String userGuess = helper.getUserInput("Make your move");
        checkUserGuess(userGuess);}
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numberOfGueses++;
        String result = "Missed";
        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("Hit")){break;}
            if (result.equals("Sink")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("All your sites goes to bottom!");
        if(numberOfGueses <= 18)
        {
            System.out.println("You was needed only " + numberOfGueses + " trys.");
            System.out.println("You are fast dumbass!");
        }else {
            System.out.println("Too many time you need for that! why you need " + numberOfGueses + " trys? You are idiot?");
            System.out.println("All world hates you! HA HA HA");
        }
        }

    public static void main(String[] args)
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
/*
        checkyourself check = new checkyourself();
        int rand = (int)(Math.random()*5+1);
        ArrayList<String>locations =new ArrayList<>();
        locations.add(rand);
        check.SetLocationCells(locations);
        boolean isalive = true;
        while(isalive = true)
        {

            String guess = helper.getUserInput("Input number from 1 to 8");
            System.out.println(guess);
            String result = check.checkYourself(guess);
            numberOfGueses++;
            if (result.equals("Sink!"))
            {
                isalive = false;
                System.out.println("You need only " + numberOfGueses + " trys");
                break;
            }
        }


    */}
}
