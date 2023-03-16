//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        .
//
// 2. Написать метод, который определяет, является ли год високосным,
//  и возвращает boolean (високосный - true, не високосный - false).
//  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//        .
//
// 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.
package hw1;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        printMaxAndMinElementOfArray(createEllementOfArray());
        leapYear();

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число для переноса в конец массива: ");
        Integer searchNumber = in.nextInt();
        int[] array = {3,2,2,3};
        int[] newArray = array;

        for(int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
        numToEnd(array, newArray, searchNumber);
    }

    public static void numToEnd (int[]a, int[]b, int k){
        int j = 0;
        for(int i = 0; i < b.length; i++){
            if (b[i] != k) {
                a[j] = b[i];
                j++;
            }
        }
        for(int i = j; i < a.length; i++){
            a [i] = k;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void leapYear() {
        Scanner in1 = new Scanner(System.in);
        System.out.printf("Введите год для проверки, явлется ли он високостный: ");
        Integer year = in1.nextInt();
        boolean yearleap = (year > 1584 && ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0)));
        if (yearleap)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }

    private static void printMaxAndMinElementOfArray(int[] array) {
        int minEllementArray = array[0];
        int maxElementArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minEllementArray) {
                minEllementArray = array[i];
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i] > maxElementArray) {
                    maxElementArray = array[i];
                }
            }
        }
        System.out.printf("Минимальный эллепент - %d, максимальный эллемент - %d\n\n\n", minEllementArray, maxElementArray);
    }

    private static int[] createEllementOfArray() {
        Scanner in = new Scanner(System.in);
        System.out.printf("lenght array: ");
        Integer lenghtArray = in.nextInt();
        int[] Array = new int[lenghtArray];
        for (int i = 0; i < lenghtArray; i++) {
            System.out.printf("Введите %d эллемент массива:", i+1);
            Array[i] = in.nextInt();
        }
        return Array;
    }
}

