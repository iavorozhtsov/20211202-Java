package lesson_06;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, "dog");
        setMaxRunDistance(500);
        setMaxSwimDistance(10);
    }

    @Override
    void swim(int distance){
        if (distance <= getMaxSwimDistance()){
            System.out.println(getName() + " had swam " + distance + " meters");
        } else{
            System.out.println(distance + " meters is too difficult water distance for dog " + getName());
        }

    }

    @Override
    void run(int distance){
        if (distance <= getMaxRunDistance()){
            System.out.println( getName() + " had ran " + distance + " meters");
        } else{
            System.out.println(distance + " meters is too difficult for dog " + getName());
        }
    }
}
