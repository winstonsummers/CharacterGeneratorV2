package com.company;

import java.util.Random;

public abstract class Character {
    Character(String charName){
        this.name = charName;
        this.str = threeDSix();
        this.dex = threeDSix();
        this.con = threeDSix();
        this.intel = threeDSix();
        this.wis = threeDSix();
        this.cha = threeDSix();
    }

    protected String name;

    protected String[] abilities = new String[10];

    protected int str;
    protected int dex;
    protected int con;
    protected int intel;
    protected int wis;
    protected int cha;

    private Random random = new Random();
    private int threeDSix(){
        int total = 0;
        int rolls = 0;
        while(rolls < 3){
            int roll = random.nextInt(6)+1;
            if(roll >= 2) {
                total += roll;
                ++rolls;
            }
        }
        return total;
    }

    protected abstract void whatIDo();

    protected abstract void whatIam();

}
