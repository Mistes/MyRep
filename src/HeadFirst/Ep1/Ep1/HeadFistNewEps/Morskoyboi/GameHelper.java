package HeadFirst.Ep1.Ep1.HeadFistNewEps.Morskoyboi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper
{
    private static final String alpfabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String promt)
    {
        String inputline = null;
        System.out.println(promt + " ");
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
            if (inputline.length() == 0)
            {
                return null;
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException " + e);
        }
        return inputline.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize)
    {
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attemts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1)
        {
            incr = gridLength;
        }

        while (!success && attemts++ < 200)
        {
            location = (int) (Math.random() + gridSize);
            //System.out.println("try Location!");
            int x = 0;  // dont understanding (((
            success = true;
            while (success && x <= comSize)
            {
                if (grid[location - 1] == 0)
                {
                    coords[x++] = location;
                    location += incr;

                    if (location >= (gridSize - 1))
                    {
                        success = false;
                    }
                    if (x > 0 && (location % gridLength == 0))
                    {
                        success = false;
                    }
                } else
                    {
                        System.out.println("Its used now " + location);
                        success = false;
                    }
                }
            }
        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("/n");
        while (x < comSize)
        {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alpfabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" cord" + x + alphaCells.get((x - 1)));

        }
        System.out.println("/n");
        return alphaCells;
    }
}

