package lesson_02;

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.
//2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
//5.* Написать метод, который определяет, является ли год високосным,
//и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.



public class HomeWork2 {

    public static void main (String[] args){

        System.out.println("1 - ***************");
        System.out.println(compareValue(10, 10));

        System.out.println("2 - ***************");
        isPositive(-1);

        System.out.println("3 - ***************");
        System.out.println(isPositive2(0));

        System.out.println("4 - ***************");
        printString("This is string", 2);

        System.out.println("5 - ***************");
        System.out.println(isVisoc(1600));

    }

    public static boolean compareValue(int a, int b){
        return ((a + b  >= 10) && (a + b <= 20));
    }

    public static void isPositive(int value){
        if (value >= 0){
            System.out.println(value + " is positive number.");
        } else {
            System.out.println(value + " is negative number.");
        }
    }

    public static boolean isPositive2(int value){
        return (value < 0);
    }

    public static void printString(String value, int count){
        for (int i = 1; i <= count; i++){
            System.out.println(value);
        }
    }

    public static boolean isVisoc(int year) {
        if (((year % 400 != 0) && (year % 100 == 0)) || (year % 4 != 0)) {
            return false;
        } else {
            return true;
        }
    }
}
