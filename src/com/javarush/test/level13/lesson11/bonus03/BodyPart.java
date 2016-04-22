package com.javarush.test.level13.lesson11.bonus03;

public final class BodyPart
{
    final static BodyPart LEG = new BodyPart("Левая нога");
    final static BodyPart LEG2 = new BodyPart("Правая нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("Правая рука");
    final static BodyPart CHEST = new BodyPart("Грудь");
    final static BodyPart ARM2 = new BodyPart("Левая рука");

    private String bodyPart;

    private BodyPart(String bodyPart)
    {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString()
    {
        return this.bodyPart;
    }
}
