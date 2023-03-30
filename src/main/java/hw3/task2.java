package hw3;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,3,1,55,22,123,43,6,-1,0,-100,4};
        System.out.println(oddCleared(arr));
    }
    public static Map<String, Double> oddCleared(int[] arr){
        Map<String,Double> result = new HashMap<>();
        int min = arr[0];
        int max = arr[0];
        double sum = 0.0;
        for (int j : arr) {
            sum += j;
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        result.put("min", (double)min);
        result.put("max", (double)max);
        result.put("arithmetic", sum/arr.length);
        return result;
    }

}