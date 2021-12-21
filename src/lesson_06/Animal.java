package lesson_06;

public class Animal {

    private static int catCount = 0;
    private static int dogCount = 0;

    private int maxRunDistance = 10;
    private int maxSwimDistance = 10;
    private String name;

    public Animal(String name, String type) {
        this.name = name;
        if (type == "cat") {
            catCount++;
        } else {
            dogCount++;
        }
        System.out.println("Welcome the " + type + " with name " + name + "\n");
    }

    void run(int distance){
        System.out.println(name + " had ran " + distance + " meters");
    }

    void swim(int distance){
        System.out.println(name + " had swam " + distance + " meters");
    }

    String getAnimalsCount(){
        return "Total dogs created: " + dogCount +
                "\nTotal cats created: " + catCount +
                "\nTotal animals created: " + (catCount + dogCount);
    }

    public String getName() {
        return name;
    }

    public void setMaxRunDistance(int distance){
        maxRunDistance = distance;
    }

    public void setMaxSwimDistance(int distance){
        maxSwimDistance = distance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }
}
