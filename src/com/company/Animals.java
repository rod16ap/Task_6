package com.company;

public class Animals {
    protected String name;
    protected int runlength;
    protected int swimlength;


    public Animals ( String name, int runlength, int swimlength) {
        this.name = name;
        this.runlength = runlength;
        this.swimlength = swimlength;
    }


    public void run ( int length){
        this.runlength = length;
        System.out.println(name + " пробежал " + length + "м");
    }

    public void swim ( int length){
        this.swimlength = length;
        System.out.println(name + " проплыл " + length + "м");

    }


}
