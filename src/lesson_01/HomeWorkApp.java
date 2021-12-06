package lesson_01;

public class HomeWorkApp {

    public static void main (String[] args){

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = -12;
        int b = 21;

        if (a + b >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor(){
        int value = 11;

        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 100){
            System.out.println("Зелёный");
        } else {
            System.out.println("Жёлтый");
        }
    }

    public static void compareNumbers(){
        int a = 1;
        int b = 10;

        if (a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

