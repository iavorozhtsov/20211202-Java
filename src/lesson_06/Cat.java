package lesson_06;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
        catCount++;
    }

    @Override
    void swim(int distance){
        System.out.println(name + " is a cat! Cats does not swim!");
    }
}
