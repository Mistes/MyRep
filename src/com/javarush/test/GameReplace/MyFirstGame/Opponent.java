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
    private int oponentarmor;
    private int oponenthp;
    private String oponame;
    private int imput;
    //ArrayList<Foe> oplist = new ArrayList<>();
    HashMap<Integer, Foe> opmap = new HashMap<>();

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

    public int getImput()
    {
        return imput;
    }

    public void setImput(int imput)
    {
        this.imput = imput;
    }
    public void IfYouChoosed()
    {
        System.out.println(String.format("You choose %s Its will be your ENEMY", opmap.get(imput).getName()));
    }

    public void IfRandomChooser()
    {
        System.out.println(String.format("Your enemy will be %s Good luck, its not me, its random!", opmap.get(imput).getName()));
    }

    public class Foe
    {
        private int armor;
        private int hp;
        private String name;

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



        Foe(int armor, int hp, String name)
        {
            this.armor = armor;
            this.hp = hp;
            this.name = name;
        }
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

    public void ReadInput(String msg)
    {
        System.out.println(msg);
        int value;

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            value = Integer.parseInt(reader.readLine());
            setImput(value);
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
    public void ChooserMethod(){
        ReadInput("Choose RANDOM ENEMY---1---- OR your ENEMY ----2-----");
        while (true){
        if (getImput() == 1)
        {
            setImput((int) (Math.random() * 3 + 1));
            OponentChooserV2();
            IfRandomChooser();
            break;
        }
        if (getImput() == 2)
        {
            ReadInput("Choose your ENEMY: 1==ORC---2==Princess-----3==DRAGON");
            OponentChooserV2();
            IfYouChoosed();
            break;
        }
        else if(getImput()<1&&getImput()>2){
            System.out.println("Why you pushing wrong buttons?");}}
    }

    public void OponentChooserV2()
    {try{
        oponentarmor = opmap.get(imput).getArmor();
        oponenthp = opmap.get(imput).getHp();
        oponame = opmap.get(imput).getName();}
    catch (NullPointerException e){
        ReadInput("You need to push only numbers from 1 to 3! But you pushed " + getImput()+ " And now all will start again!");
        ChooserMethod();

    }
    }
}











