package HeadFirst.Ep1.Ep1;

/**
 * Created by Администратор on 11.02.2016.
 */
public class ep1
{
    public static void main (String[] args)
    {
        int beerNum;
        String word = "Bottles";


        for (beerNum = 10; beerNum >=0; beerNum--)
        {
            if (beerNum > 1){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");}


             if (beerNum == 1)
            {
                word = "Bottle";
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("Take one down");
                System.out.println("Pass it around");

            } else if (beerNum == 0)
            {
                System.out.println("No bottles of beer in the wall");
            }
        }
    }
}
