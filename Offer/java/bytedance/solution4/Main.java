package bytedance.solution4;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        PriorityQueue<String> list = new PriorityQueue<>();
        dfs(list, string, new StringBuilder(), 0);
        printList(list);

    }
    private static void dfs(PriorityQueue<String> list, String string, StringBuilder stringBuilder, int index){
        if (index == string.length()){
            list.add(stringBuilder.toString());
            return;
        }
        for (int i = index; i < string.length(); i++){
            int temp = check(string.substring(index, i+1));
            if (temp >= 1 && temp <= 26){
                dfs(list, string, new StringBuilder(stringBuilder).append((char) (temp- 1 + 'A')), i+1);
            }else {
                break;
            }
        }
    }

    private static int check(String str){
        return Integer.parseInt(str);
    }

    private static void printList(PriorityQueue<String> list){
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
