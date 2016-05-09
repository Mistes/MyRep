package HeadFirst.Ep1.Ep1.HeadFistNewEps;

import java.io.*;

/**
 * Created by ������������� on 19.04.2016.
 */
public class test1
 {
     public static void main(String[] args) throws IOException
     {
         File f = new File("x://robots.txt");
         BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
         int b = Integer.parseInt(br.readLine());
         System.out.println(b);
         br.close();
         FileWriter writer = new FileWriter("x://robots.txt");
         String d = Integer.toString(b + 1);
         writer.write(d);
         writer.close();

     }
    }



