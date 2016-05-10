package com.javarush.test.GameReplace.MyFirstGame;

import java.io.*;

public class TeePrintStream extends PrintStream
{
    private final PrintStream second;

    public TeePrintStream(OutputStream main, PrintStream second)
    {
        super(main);
        this.second = second;
    }

    public static void FileSaver() throws IOException
    {
        File f = new File("d://results/robots.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        int b = Integer.parseInt(br.readLine());
        br.close();
        FileWriter writer = new FileWriter("d://results/robots.txt");
        String d = Integer.toString(b + 1);
        writer.write(d);
        writer.close();
        String one = "d://results/gameScore";
        String two = ".txt";
        String fileName = one + d + two;
        FileOutputStream filed = new FileOutputStream(fileName);
        TeePrintStream tee = new TeePrintStream(filed, System.out);
        System.setOut(tee);

    }

    /**
     * Closes the main stream.
     * The second stream is just flushed but <b>not</b> closed.
     *
     * @see java.io.PrintStream#close()
     */
    @Override
    public void close()
    {
        // just for documentation
        super.close();
    }

    @Override
    public void flush()
    {
        super.flush();
        second.flush();
    }

    @Override
    public void write(byte[] buf, int off, int len)
    {
        super.write(buf, off, len);
        second.write(buf, off, len);
    }

    @Override
    public void write(int b)
    {
        super.write(b);
        second.write(b);
    }

    @Override
    public void write(byte[] b)
    {
        try
        {
            super.write(b);
            second.write(b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
