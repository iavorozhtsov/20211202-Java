//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.


package lesson_06;

public class HomeWork6 {

    public static void main(String[] args){
        Cat cat1 = new Cat("Jessy");
        cat1.run(200);
        cat1.swim(20);
        cat1.run(220);
        System.out.println();

        Cat cat2 = new Cat("Pixi");
        cat2.run(100);
        cat2.swim(10);
        cat2.run(250);
        System.out.println();

        Dog dog = new Dog("Brut");
        dog.run(500);
        dog.swim(10);
        dog.run(550);
        dog.swim(15);
        System.out.println();

        System.out.println(cat2.getAnimalsCount());
    }
}
