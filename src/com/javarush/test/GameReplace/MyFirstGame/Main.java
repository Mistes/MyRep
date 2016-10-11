package com.javarush.test.GameReplace.MyFirstGame;

import java.io.IOException;


/**
 * Created by Mistes on 18.04.2016.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Main main = new Main();
        TeePrintStream.FileSaver();
        main.gamemethod();
      //  Mail.SuperSending();

    }
    public void gamemethod(){
       Utill util = new Utill();
        util.ReadInput("Choose gamemode, for PVE press ---1---- for PVP press ----2-----");
        while (true){
            if (util.getImput() == 1)
            {
                System.out.println("You choosed PVE");
                PVE();
                break;
            }
            if (util.getImput() == 2)
            {
                System.out.println("You choosed PVP");
                PVP();
                break;
            }
            else {
                System.out.println("Why you pushing wrong buttons?");
                gamemethod();}}
    }

    public void PVE()
    {
        SpeedCalculator player1calc = new SpeedCalculator();
        Person player1 = new Person();
        Opponent opo = new Opponent();
        Weapon weapon1 = new Weapon();
        Armor armor1 = new Armor();
        player1.PersonChooserV2();
        opo.ChooserMethod();
        weapon1.WeaponChooserV2();
        armor1.ArmorChooserV2();
        YourHPmethod pvehp = new YourHPmethod();


        int opohp = opo.getOpoHP();
        int youhp = pvehp.YourHP(armor1, player1);
        int round = 0;
        while (true)
        {
            round++;
            System.out.println("Now is " + (round) + " round");
            int dmg;
            int enemydmg = 0;
            for(int i = 0; i <weapon1.getWepspeed(); i++){
                if (player1calc.misschancePVE(weapon1,player1)){//missedChance
                    dmg = (int)((((weapon1.getWepdamage()) + (int) (Math.random() * 25 - 15)) - opo.getOpoArmor()) * criticalhit.Iscritical(weapon1));
                    opohp = opohp - dmg;
                    if (dmg < 0)
                    {
                        dmg = 0;
                    }
                    System.out.println("You hit your enemy at " + dmg + " HP");
                    if(opohp < 0)   {System.out.println(opo.getOponame() +  " is died! YOU ARE BRUTAL MURDERER!!!");break;}
                    System.out.println(" Hp your enemy is now " + opohp);
                }
            }
            if(opohp < 0)   {break;}

            if(player1calc.speedCalcPVE(armor1, player1)){
                enemydmg = (opo.getOpodamage() + ((int) (Math.random() * 30 - 15))) - armor1.getStatdefence();
                if (enemydmg < 0)
                {
                    enemydmg = 0;
                }
            }
            youhp = youhp - enemydmg;

            if (enemydmg > 0)
            {
                System.out.println(opo.getOponame() + " hit you at " + enemydmg + " HP");
                if (youhp < 0)
                {
                    System.out.println(player1.getPersonname() + " is died! You are bad player");
                    break;
                }
            }
            System.out.println(" Your hp now " + youhp);

            if(youhp < 0)   {System.out.println(player1.getPersonname() + " is died! You are bad player");break;}
            try
            {
                Thread.sleep(3500);
            }catch (InterruptedException e){
                System.out.println(e);
            }


        }
    }

    public void PVP()
    {
        SpeedCalculator player1calc = new SpeedCalculator();
        SpeedCalculator player2calc = new SpeedCalculator();
        Person player1 = new Person();
        Person player2 = new Person();
        Weapon weapon1 = new Weapon();
        Weapon weapon2 = new Weapon();
        Armor armor1 = new Armor();
        Armor armor2 = new Armor();
        player1.PersonChooserV2();
        System.out.println("Player1 choosed " + player1.getPersonname());
        weapon1.WeaponChooserV2();
        armor1.ArmorChooserV2();
        System.out.println("Now its turn to choose for player2");
        System.out.println(" ");
        player2.PersonChooserV2();
        System.out.println("Player2 choosed " + player2.getPersonname());
        weapon2.WeaponChooserV2();
        armor2.ArmorChooserV2();
        YourHPmethod player1hp = new YourHPmethod();
        YourHPmethod player2hp = new YourHPmethod();


        int play1 = player1hp.YourHP(armor1, player1);
        int play2 = player2hp.YourHP(armor2, player2);
        int round = 0;
        while (true)
        {
            round++;
            System.out.println("Now is " + (round) + " round");
            int dmg1;
            int dmg2;
            for (int i = 0; i < weapon1.getWepspeed(); i++)
            {
                if (player1calc.speedCalcPVP(armor2, weapon1, player2))
                {//missedChance for player2
                    dmg1 = (int) ((((weapon1.getWepdamage()) + (int) (Math.random() * 25 - 15)) - armor2.getStatdefence()) * criticalhit.Iscritical(weapon1));
                    if (dmg1 < 0)
                    {
                        dmg1 = 0;
                    }

                   else play2 = play2 - dmg1;
                    System.out.println("You hitPlayer2 at " + dmg1 + " HP");
                    if (play2 < 0)
                    {
                        System.out.println(player2.getPersonname() + " is died!          Player 1 WINS!!!!                  ");
                        break;
                    }
                    System.out.println(String.format(" Hp Player2 %s is now %d", player2.getPersonname(), play2));
                }
            }
            if (play2 < 0)
            {
                break;
            }

            for (int i = 0; i < weapon2.getWepspeed(); i++)
            {
                if (player2calc.speedCalcPVP(armor1, weapon2, player1))
                {//missedChance for player1
                    dmg2 = (int) ((((weapon2.getWepdamage()) + (int) (Math.random() * 25 - 15)) - armor1.getStatdefence()) * criticalhit.Iscritical(weapon2));
                    if (dmg2 < 0)
                    {
                        dmg2 = 0;
                    }
                   else play1 = play1 - dmg2;
                    System.out.println("You hit Player1 at " + dmg2 + " HP");
                    if (play1 < 0)
                    {
                        System.out.println(player1.getPersonname() + " is died!          Player 2 WINS!!!!                  ");
                        break;
                    }
                    System.out.println(String.format(" Hp Player1 %s is now %d", player1.getPersonname(), play1));
                }
            }
            if (play1 < 0)
            {
                break;
            }


            try
            {
                Thread.sleep(3500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public void Nodamage(Person pers, Opponent foe, int dmg, int enemydmg){
        if (dmg == 0){System.out.println(pers.getPersonname() + " missed this hit!");
            if (enemydmg ==0){
                System.out.println(foe.getOponame() + "missed this hit! You really lucky bustard");}
        }

    }
    public void Endingsmg(Person pers, Opponent foe, int opohp, int yourhp){
    }


}
