package lesson_03;

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
//    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n];
//    5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;
//    6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
//    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    **Примеры:
//    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//    checkBalance([1, 1, 1, 8, 1]) → false
//    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.


import java.util.Random;

public class HomeWork3 {
    static Random rnd = new Random();


    public static void main(String[] args){
        System.out.println("Task #1");
        task_01();

        System.out.println("\nTask #2");
        task_02();

        System.out.println("\nTask #3");
        task_03();

        System.out.println("\nTask #4");
        task_04();

        System.out.println("\nTask #5");

        int[] int_arr2 = task_05(rnd.nextInt(10), rnd.nextInt(20));
        for (int i = 0; i < int_arr2.length; i++) {
            System.out.print(int_arr2[i] + "\t");
        }
        System.out.println();

        System.out.println("\nTask #6");
        task_06();

        System.out.println("\nTask #7");
        int[] int_arr3 = new int[5 + rnd.nextInt(16)];
        for (int i = 0; i < int_arr3.length; i++) {
            int_arr3[i] = rnd.nextInt(31);
            System.out.print(int_arr3[i] + "\t");
        }
        System.out.println();

        //Массив для проверки
        int[] int_arr4 = {20, 2, 2, 2, 1, 2, 9, 2}; //{16, 24, 24, 9, 3, 16, 19, 14, 21, 13, 18, 15, 12, 4, 8, 29, 5}
        System.out.println(task_07(int_arr3));

    }

    public static void task_01(){
        int[] int_arr = new int[rnd.nextInt(20)];

        for (int i = 0; i < int_arr.length; i++) {
            int_arr[i] = rnd.nextInt(2);
            System.out.print(int_arr[i] + " | ");
        }

        System.out.println();

        for (int i = 0; i < int_arr.length; i++) {
            if (int_arr[i] == 0) {
                int_arr[i] = 1;
            } else {
                int_arr[i] = 0;
            }
            System.out.print(int_arr[i] + " | ");
        }

        System.out.println();
    }

    public static void task_02(){
        int[] int_arr = new int[100];

        for (int i = 0; i < int_arr.length; i++) {
            int_arr[i] = i + 1;
            System.out.print(int_arr[i] + " | ");
        }

        System.out.println();
    }

    public static void task_03(){
        int[] int_arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < int_arr.length; i++) {
            System.out.print(int_arr[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < int_arr.length; i++) {
            if (int_arr[i] < 6){
                int_arr[i] *= 2;
            }
            System.out.print(int_arr[i] + "\t");
        }

        System.out.println();
    }

    public static void task_04(){
        int a = rnd.nextInt(20);
        int [][] int_arr = new int[a][a];

        for (int i = 0; i < int_arr.length; i++) {
            for (int j = 0; j < int_arr[i].length; j++) {
                if ((i == j) || (i == int_arr[i].length - j - 1)){
                    int_arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < int_arr.length; i++) {
            for (int j = 0; j < int_arr[i].length; j++) {
                System.out.print(int_arr[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static int[] task_05(int len, int initialValue){
        int[] int_arr = new int[len];

        System.out.println("Len = " + len + ", initVal = " + initialValue);

        for (int i = 0; i < int_arr.length; i++) {
            int_arr[i] = initialValue;
            System.out.print(int_arr[i] + "\t");
        }

        System.out.println();

        return int_arr;
    }

    public static void task_06(){
        int [] int_arr = new int[5 + rnd.nextInt(16)];

        for (int i = 0; i < int_arr.length; i++) {
            int_arr[i] = rnd.nextInt(30);
            System.out.print(int_arr[i] + "\t");
        }
        System.out.println();

        int minValue = int_arr[0];
        int minValueIndex = 0;
        int maxValue = int_arr[0];
        int maxValueIndex = 0;

        for (int i = 0; i < int_arr.length; i++) {
            if (int_arr[i] < minValue){
                minValue = int_arr[i];
                minValueIndex = i;
            } else if (int_arr[i] > maxValue){
                maxValue = int_arr[i];
                maxValueIndex = i;
            }
        }

        System.out.println("Minimal value = " + minValue + " has index = " + minValueIndex);
        System.out.println("Maximum value = " + maxValue + " has index = " + maxValueIndex);
    }

    public static boolean task_07(int[] int_arr){
        int left;
        int right;

        for (int i = 1; i < int_arr.length; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left += int_arr[j];
            }
            for (int j = i; j < int_arr.length; j++) {
                right += int_arr[j];
            }
            if (left == right) {
                System.out.println("Balance near index " + i);
                return true;
                //break;
            }
        }

        System.out.println("Balance not found");
        return false;
    }
}
