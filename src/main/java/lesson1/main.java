package lesson1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
//        printHelloWorld();
//        printName();
        printCountNumberOneInArray();
    }

    private static void printCountNumberOneInArray() {
        int[] array = {1,2,3,4,5,6,7,8,8,0};
        int count = 0;
        int maxCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]){
                count ++;
            }
            else {
                maxCount = count;
                count = 0;
            }
        }
        if (maxCount <= 0){
            System.out.println(maxCount);
        } else {
            System.out.println(maxCount+1);
        }
    }

    private static void printName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("age: ");
        String age = iScanner.nextLine();
        System.out.printf("Hello %s %s age!", name, age);

    }

    private static void printHelloWorld() {
        System.out.println("hello world");
    }
}
