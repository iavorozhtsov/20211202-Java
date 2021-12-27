package lesson_06;

public class Animal {

    private static int animalCount = 0;

    protected static int catCount = 0;
    protected static int dogCount = 0;

    protected int maxRunDistance = 10;
    protected int maxSwimDistance = 10;
    protected String name;

    public Animal(String name){
        this.name = name;
        animalCount++;
        System.out.println("Welcome new animal with name " + name);
    }

    void run(int distance){
        if (distance <= this.maxRunDistance) {
            System.out.println(name + " had ran " + distance + " meters");
        } else{
            System.out.println(distance + " meters is too hard for " + this.name);
        }
    }

    void swim(int distance){
        if (distance <= this.maxSwimDistance) {
            System.out.println(name + " had swam " + distance + " meters");
        } else{
            System.out.println(distance + " meters swimming is too hard for " + this.name);
        }
    }

    protected static String getAnimalsCount(){
        return "Cats created " + catCount + "\n" +
                "Dogs created: " + dogCount + "\n" +
                "Total animals created: " + animalCount;
    }
}
