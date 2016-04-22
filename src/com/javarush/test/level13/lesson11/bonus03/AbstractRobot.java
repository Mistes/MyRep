package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;
    private String name;
    public AbstractRobot(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public BodyPart attack()
    {
        double a = Math.random() * 6 +1;
        int n = (int)a;
        BodyPart attackedBodyPart = null;
        hitCount = n;

        if (hitCount == 1)
        {
            attackedBodyPart =  BodyPart.ARM;
        } else if (hitCount == 2)
        {
            attackedBodyPart = BodyPart.HEAD;
        }else if (hitCount ==5)
        {
            attackedBodyPart = BodyPart.ARM2;
        }
        else if (hitCount ==6)
        {
            attackedBodyPart = BodyPart.LEG2;
        } else if (hitCount ==4)
        {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            attackedBodyPart =  BodyPart.LEG;
        }
        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        double a = Math.random() * 6+1;
        int n = (int)a;
        BodyPart defencedBodyPart = null;
        hitCount = n;

        if (hitCount == 1)
        {
            defencedBodyPart =  BodyPart.HEAD;
        } else if (hitCount == 2)
        {
            defencedBodyPart =  BodyPart.LEG;
        }
        else if(hitCount ==4)
        {
            defencedBodyPart = BodyPart.CHEST;
        }
        else if(hitCount ==5)
        {
            defencedBodyPart = BodyPart.LEG2;
        }
        else if(hitCount ==6)
        {
            defencedBodyPart = BodyPart.ARM2;
        }

        else if (hitCount == 3)
        {
            hitCount = 0;
            defencedBodyPart =  BodyPart.ARM;
        }
        return defencedBodyPart;
    }

}
