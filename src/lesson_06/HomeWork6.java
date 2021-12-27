//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.


package lesson_06;

import java.util.Random;

public class HomeWork6 {
    static Random rnd = new Random();

    public static void main(String[] args){

        Animal[] animalsArray = new Animal[5];
        animalsArray[0] = new Cat("Jessy");
        animalsArray[1] = new Cat("Pixi");
        animalsArray[2] = new Dog("Brut");
        animalsArray[3] = new Dog("Richard");
        animalsArray[4] = new Cat("Cookie");

        for (int i = 0; i < animalsArray.length; i++) {
            animalsArray[i].run(rnd.nextInt(551));
            animalsArray[i].swim(rnd.nextInt(26));
            System.out.println();
        }

        System.out.println(Animal.getAnimalsCount());
    }
}
