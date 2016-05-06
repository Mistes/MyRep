package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Администратор on 05.05.2016.
 */
public class YourHPmethod
{
    public int YourHP(Armor hpfromarm, Person personhp){
        return hpfromarm.getStatyourhpbonus() + personhp.getPersonhp();
    }
}
