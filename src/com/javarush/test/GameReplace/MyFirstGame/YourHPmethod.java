package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Администратор on 05.05.2016.
 */
public class YourHPmethod
{
    public int YourHPPVE(Armor hpfromarm, Person personhp){
        return hpfromarm.getStatyourhpbonus() + personhp.getPersonhp();
    }
    public int YourHPPVP(Armor hpfromarm, Person personhp,String msg){
        System.out.println(msg);
        return hpfromarm.getStatyourhpbonus() + personhp.getPersonhp();
    }
}
