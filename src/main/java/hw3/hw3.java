package hw3;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,1,55,22,123,43,6,-1,0,-100,4};
        System.out.println(Arrays.toString(oddCleared(arr)));
    }
    public static int[] oddCleared(int[] arr){
        return Arrays.stream(arr)
                .filter(num -> num %2 !=0).toArray();
    }
}

