package yuanfudao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] num = new int[n];
        for (int i = 0; i < strings.length; i++){
            num[i] = Integer.parseInt(strings[i]);
        }
        help(num, m);
    }

    private static void help(int[] num, int m){
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : num){
            if (!count.containsKey(a)){
                count.put(a, 1);
            }else {
                count.put(a, count.get(a) + 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = count.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue() > m){
                iterator.remove();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int n : num){
            if (count.containsKey(n)){
                stringBuilder.append(n).append(" ");
            }
        }
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.length()-1));
    }
}
