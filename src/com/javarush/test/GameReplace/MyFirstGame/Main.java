package com.javarush.test.GameReplace.MyFirstGame;

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
                    System.out.println("You hit your enemy at " + dmg + " HP");
                    if(opohp < 0)   {System.out.println(opo.getOponame() +  " is died! YOU ARE BRUTAL MURDERER!!!");break;}
                    System.out.println(" Hp your enemy is now " + opohp);
                }
            }
            if(opohp < 0)   {break;}

            if(player1calc.speedCalcPVE(armor1, player1)){
                enemydmg = (opo.getOpodamage() + ((int) (Math.random() * 30 - 15))) - armor1.getStatdefence();
            }
            youhp = youhp - enemydmg;

            if(enemydmg > 0){System.out.println(opo.getOponame() + " hit you at " + enemydmg + " HP");}
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
