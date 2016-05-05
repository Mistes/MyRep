package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.level20.lesson04.task05.Solution;

/**
 * Created by Mistes on 18.04.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.gamemethod();


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
        int youhp = pvehp.YourHPPVE(armor1,player1);
        for (int i = 0; i <= player1calc.speedCalcPVE(armor1, weapon1, player1); i++)
        {
            System.out.println("Now is " + (i + 1) + " round");
            System.out.println(" Hp your enemy is now " + opohp);
            System.out.println(" Your hp now " + youhp);
            int dmg = 0;
            int enemydmg = 0;
             if (player1calc.misschancePVE()){//missedChance
            dmg = ((((weapon1.getWepdamage()) + (int) (Math.random() * 25 - 15)) - opo.getOpoArmor()) * (int)criticalhit.Iscritical());}
            if(player1calc.speedCalcPVP(armor1,weapon1,player1)){
                enemydmg = (opo.getOpodamage() + ((int) (Math.random() * 30 - 15))) - armor1.getStatdefence();
            }
            youhp = youhp - enemydmg;
            opohp = opohp - dmg;
                Nodamage(player1,opo,dmg,enemydmg);
            if(dmg > 0)     {System.out.println("You hit your enemy at " + dmg + " HP");}
            if(enemydmg > 0){System.out.println(opo.getOponame() + " hit you at " + enemydmg + " HP");}
            if(opohp < 0)   {System.out.println(opo.getOponame() +  " is died! YOU ARE BRUTAL MURDERER!!!");break;}
            if(youhp < 0)   {System.out.println(player1.getPersonname() + " is died! You are bad player");break;}
            if (i == player1calc.speedCalcPVE(armor1, weapon1, player1)) {System.out.println("Your enemy still alive.YOU ARE JERK ! "+opo.getOponame() + " have left  only " + opohp + " HP");}
            try
            {
                Thread.sleep(3500);
            }catch (InterruptedException e){
                System.out.println(e);
            }


        }
    }
    public void PVP(){
        System.out.println("-------------IN PROGRESS------------");
        SpeedCalculator player1calc = new SpeedCalculator();
        Person player1 = new Person();
        Opponent opo = new Opponent();
        Weapon weapon1 = new Weapon();
        Armor armor1 = new Armor();
        Weapon weapon2 = new Weapon();
        player1.PersonChooserV2();
        opo.ChooserMethod();
        weapon1.WeaponChooserV2();
        armor1.ArmorChooserV2();
        //weapon2.WeaponChooserV2();
        //System.out.println("Player1 choosed " +weapon.getWepname());
        //System.out.println("Player2 choosed " + weapon2.getWepname());
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
