package lesson_06;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        dogCount++;
    }
}
