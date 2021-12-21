package lesson_06;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, "cat");
        setMaxRunDistance(200);
        setMaxSwimDistance(0);
    }

    @Override
    void swim(int distance){
        System.out.println( getName() + " is a cat! Cats does not swim!");
    }

    @Override
    void run(int distance){
        if (distance <= getMaxRunDistance()){
            System.out.println(getName() + " had ran " + distance + " meters");
        } else{
            System.out.println(distance + " meters is too difficult for cat " + getName());
        }
    }
}
