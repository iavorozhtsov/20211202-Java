package lesson_05;

import java.util.Random;

/**
 * На JAVA НЕ!!!! ПИШУТ на русском языке *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class HomeWork5 {

    public static void main (String[] args){

        Employee[] persArr = new Employee[5];
        Random rnd = new Random();

        persArr[0] = new Employee("Ivan", "Director", "ceo@comp.ru", "8-921-921-99-99", 100000, 35 + rnd.nextInt(15));
        persArr[1] = new Employee("Natasha", "St. Manager", "manager@comp.ru", "8-921-921-99-98", 90000, 35 + rnd.nextInt(15));
        persArr[2] = new Employee("Natasha1", "St. Manager", "manager@comp.ru", "8-921-921-99-98", 90000, 35 + rnd.nextInt(15));
        persArr[3] = new Employee("Natasha", "St. Manager", "manager@comp.ru", "8-921-921-99-98", 90000, 35 + rnd.nextInt(15));
        persArr[4] = new Employee("Natasha2", "St. Manager", "manager@comp.ru", "8-921-921-99-98", 90000, 35 + rnd.nextInt(15));


        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].age > 40) {
                persArr[i].info();
            }
        }

    }
}
