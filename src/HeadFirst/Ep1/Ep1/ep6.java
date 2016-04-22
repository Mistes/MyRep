package HeadFirst.Ep1.Ep1;

import java.io.*;

/**
 * Created by ������������� on 29.03.2016.
 */
public class ep6
{
    public static void main(String[] args) throws IOException
    {
        //������ ������ � ������
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //����������� ������ � ����� ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //��������� in
        System.setIn(is);

        //�������� ������� �����, ������� �� ����������� � ����� ������������
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
