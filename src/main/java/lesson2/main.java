//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1
//
//        Timofei Safronov: 2. Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.

package lesson2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println(build());
        System.out.println(zipArr());
    }

    private static StringBuilder zipArr() {
        String string1 = "aaabddddwwwooq";
        StringBuilder arr = new StringBuilder();
        int count = 0;
        for (int i = 1; i < string1.length(); i++) {
            if (string1.charAt(i) == string1.charAt(i - 1)){
                count+=1;
            }
            else {
                arr.append(string1.charAt(i-1)).append(count+1);
                count = 0;
            }
        }
        arr.append(string1.charAt(string1.length()-1)).append(count+1);

        return arr;
    }

    private static StringBuilder build(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        Integer countSymbol = in.nextInt();
        System.out.print("Введите символ 1: ");
        String symbol1 = in.next();
        System.out.print("Введите символ 2: ");
        String symbol2 = in.next();
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < countSymbol; i++) {
            if (i % 2 == 0){
                arr.append(symbol1);
            } else {
                arr.append(symbol2);
            }
        }
        return arr;

    }
}
