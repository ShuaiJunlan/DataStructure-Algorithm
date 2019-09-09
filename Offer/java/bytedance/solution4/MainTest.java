package bytedance.solution4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        Queue<String> re = new PriorityQueue<>();
        help(re, str, new StringBuilder(), 0);
        re.forEach(System.out::println);
    }
    private static void help(Queue<String> re, String s, StringBuilder stringBuilder, int index) {
        if (index == s.length()) {
            re.add(stringBuilder.toString());
            return;
        }
        for (int i = index; i < s.length(); i++) {
            int t = Integer.parseInt(s.substring(index, i + 1));
            if (t > 26 || t < 1){
                break;
            }
            help(re, s, new StringBuilder(stringBuilder).append((char) (t - 1 + 'A')), i + 1);
        }
    }
}
