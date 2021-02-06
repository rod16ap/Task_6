package com.company;

public class Dog extends Animals{
    public Dog(String name, int runlength, int swimlength){
        super(name, runlength, swimlength);
    }

    @Override
    public void run ( int runlength ) {
        if (runlength>500){
            System.out.println("Пробежать " + runlength + "м? "+ "Для " + name +"a " + " это предел мечтаний, не добежит!");
        }
        else super.run(runlength);
    }

    public void swim (int swimlength ) {
        if (swimlength>10){
            System.out.println("Но проплыть " +swimlength + "м? " + "Вы уж извините " + name + " не рыба, столько не проплывет.");
        }
        else super.swim(swimlength);
    }


}
