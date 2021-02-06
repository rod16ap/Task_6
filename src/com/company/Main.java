package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat( "Мурзик", 150, 50);
        catsArray[1] = new Cat( "Барсик", 200, 80);
        catsArray[2] = new Cat( "Леопольд", 100, 10);
        catsArray[3] = new Cat( "Матроскин", 300, 40);

        Dog[] dogsArray = new Dog[2];
        dogsArray[0] = new Dog("Рекс", 250, 50);
        dogsArray[1] = new Dog("Бетховен", 550, 10);

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].run(catsArray[i].runlength);
            catsArray[i].swim(catsArray[i].swimlength);

        }

        for (int j = 0; j < dogsArray.length; j++) {
                dogsArray[j].run(dogsArray[j].runlength);
                dogsArray[j].swim(dogsArray[j].swimlength);
        }

        System.out.println("Для эксперимента привлекли " + ( catsArray.length + dogsArray.length )+ " животных: " + catsArray.length + " кошек" + " и " + dogsArray.length + " собак");

    }

}
