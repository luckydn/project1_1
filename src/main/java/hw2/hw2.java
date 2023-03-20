//1. Напишите метод,
//        который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
//
//        2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения
package hw2;

import java.io.FileWriter;

public class hw2 {
    public static void main(String[] args) {
//        System.out.println(printIsPalindrome());
        printTest();
    }

    private static void printTest() {
        StringBuilder str1 = new StringBuilder();
        str1.append("TEST ".repeat(100));
        System.out.println(str1);
        try {
            FileWriter file1 = new FileWriter("Test.txt");
            file1.write(String.valueOf(str1));
            file1.flush();
        } catch (Exception e){
            System.out.println("FAIL");
        }
    }

    private static boolean printIsPalindrome() {
        String str = "liiil";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 -i)){
                return false;
            }
        }
        return true;
    }
}
