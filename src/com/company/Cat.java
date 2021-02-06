package com.company;

public class Cat extends Animals{
    public Cat(String name, int runlength, int swimlengt){
        super(name, runlength, swimlengt);

    }

    @Override
    public void run ( int runlength ) {
        if (runlength>200){
            System.out.println("Пробежать " +runlength + "м? " + "Для " + name +"a " + " это уж слишком, помрет на середине пути ");
        }
        else super.run(runlength);
    }

    public void swim (int swimlength ) {
        System.out.println("Но проплыть " + swimlength + "м? " + "Да вы что! " + name + " вообще плавать не умеет.");
    }
}
