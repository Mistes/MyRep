package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by Mistes on 22.05.2016.
 */
public class Snake {
    private ArrayList<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;
    public Snake(int x,int y) {
        SnakeSection head = new SnakeSection(x,y);
        sections = new ArrayList<>();
        sections.add(head);
        isAlive = true;
    }
    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
    public ArrayList<SnakeSection> getSections() {
        return sections;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public SnakeDirection getDirection() {
        return direction;
    }
    public int getX(){
        return sections.get(0).getX();
    }
    public int getY(){
        return sections.get(0).getY();
    }
    public void move(){}
}