package HeadFirst.Ep1.Ep1.HeadFistNewEps;


/**
 * Created by ������������� on 19.04.2016.
 */
public class main
{
    public static void main(String[] args)
    {
        //String s = "Good news everyone!";
        //int index = s.lastIndexOf("ne");
        // System.out.print(index);
        //int speed = 100;
        //int variabled = (speed/20) + ((int) (Math.random() * 3)-1);
        // System.out.println(variabled);
        int avoidness = 113 + ((int) (Math.random() * 30) - 15);
        int cooficient = avoidness / 25;
        if (cooficient < 2)
        {
            cooficient = 2;
        }
        int i = (int) (Math.random() * 10);
        if (i < cooficient)
        {
            System.out.println(" avoid this hit!!!");
            System.out.println(cooficient);


        } else
        {
            System.out.println(cooficient);
        }

    }


}
