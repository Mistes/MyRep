package com.javarush.test.GameReplace.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mistes on 20.04.2016.
 */
public class Opponent
{
    Utill util = new Utill();
    //ArrayList<Foe> oplist = new ArrayList<>();
    HashMap<Integer, Foe> opmap = new HashMap<>();
    private int oponentarmor;
    private int oponenthp;
    private String oponame;

    public int getOpoHP()
    {
        return oponenthp;
    }

    public int getOpoArmor()
    {
        return oponentarmor;
    }

    public String getOponame()
    {
        return oponame;
    }


    public void IfYouChoosed()
    {
        System.out.println(String.format("You choose %s Its will be your ENEMY", opmap.get(util.getImput()).getName()));
    }

    public void IfRandomChooser()
    {
        System.out.println(String.format("Your enemy will be %s Good luck, its not me, its random!", opmap.get(util.getImput()).getName()));
    }

    public void SetEnemies()
    {
        Foe miniorc = new Foe(20, 215, "ORC!!!");
        Foe miniPrincess = new Foe(10, 150, "So cute princess!");
        Foe miniDragon = new Foe(5, 400, "Really impressive DRAGON!");
        opmap.put(1, miniorc);
        opmap.put(2, miniPrincess);
        opmap.put(3, miniDragon);

    }
    public String Who(HashMap<Integer, Foe> hehe)
    {
        String then = "";
        for (HashMap.Entry<Integer, Foe> map : hehe.entrySet()
                )
        {
            Integer keys = map.getKey();
            String value = map.getValue().getName();
            String who = keys + "==" + value + "----";
            then = then + who;


            // 1==Mace---2==Dagger-----3==Sword-----4==Nunchakas
        }
        return then;

    }

    public void ChooserMethod(){
        SetEnemies();
        util.ReadInput("Choose RANDOM ENEMY---1---- OR your ENEMY ----2-----");
        while (true){
        if (util.getImput() == 1)
        {
            util.setImput((int) (Math.random() * 3 + 1));
            OponentChooserV2();
            IfRandomChooser();
            break;
        }
        if (util.getImput() == 2)
        {
            util.ReadInput("Choose your ENEMY: " + Who(opmap));
            OponentChooserV2();
            IfYouChoosed();
            break;
        }
        else {
            System.out.println("Why you pushing wrong buttons?");
            ChooserMethod();}}
    }

    public void OponentChooserV2()
    {try{
        oponentarmor = opmap.get(util.getImput()).getArmor();
        oponenthp = opmap.get(util.getImput()).getHp();
        oponame = opmap.get(util.getImput()).getName();}
    catch (Exception e){
        System.out.println("You need to push only numbers from 1 to " + opmap.size() +"! But you pushed " + util.getImput() + " And now all will start again!");
        ChooserMethod();
    }
    }

    public class Foe
    {
        private int armor;
        private int hp;
        private String name;

        Foe(int armor, int hp, String name)
        {
            this.armor = armor;
            this.hp = hp;
            this.name = name;
        }

        public int getArmor()
        {
            return armor;
        }

        public int getHp()
        {
            return hp;
        }

        public String getName()
        {
            return name;
        }
    }
}











