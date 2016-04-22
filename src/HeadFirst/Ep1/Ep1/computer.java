package HeadFirst.Ep1.Ep1;

/**
 * Created by Администратор on 01.04.2016.
 */
public class computer
{
    public static void main(String[] args)
    {
        computer comp = new computer();
        Processor i7 = new Processor();
        RAM kingston = new RAM();
        PowerSupply chieftec = new PowerSupply();
        i7.powerON();
        kingston.powerON();
        chieftec.powerON();


    }
    interface power{
        public void powerON();
    }
    public static class RAM implements power{
        private boolean Isstart = false;
        @Override
        public void powerON()
        {
            Isstart = true;

            System.out.println("RAM is started");
        }
    }
    public static class Processor implements power
    {
        private boolean Isstart = false;

        @Override
        public void powerON()
        {
            Isstart = true;
            System.out.println("Processor is started");
        }
    }
        public static class PowerSupply implements power{
            private boolean Isstart = false;
            boolean Giveenergy = true;

            @Override
            public void powerON()
            {
                Isstart = true;
                System.out.println("Giving energy to other components");

            }
        }
    }

