package hw3;

import java.util.ArrayList;
import java.util.Arrays;


public class task3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>
                (Arrays.asList("one", "car", "bus", "3", "doll", "4"));
        System.out.println(digitCleaner(arr));
    }
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<String> digitCleaner(ArrayList<String> arr){
        arr.removeIf(task3::isNumeric);
        return arr;
    }

}