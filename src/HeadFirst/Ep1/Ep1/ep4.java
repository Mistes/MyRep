package HeadFirst.Ep1.Ep1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 25.02.2016.
 */
public class ep4
{


    public static void main(String[] args) throws Exception
    {
        int z = 25;
        Check one = new Check();
        Thread dno = new Thread(one);
        Check two = new Check();
        dno.start();
        Thread dniwe = new Thread(two);
        dniwe.start();
        dniwe.sleep(z * 1000);

    }
    static class Check implements Runnable {

        @Override
        public void run()
        {
            try{BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Input seconds here:");
                String a = reader.readLine();
                int z = Integer.parseInt(a);
                for (int i = 0; i < z; i++){
                    System.out.println( i+1 + " second");
                    Thread.sleep(1000);}

            }catch (Exception e){}
        }
    }
}
