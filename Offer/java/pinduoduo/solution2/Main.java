package pinduoduo.solution2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++){
            help(scanner.next(), scanner.next());
        }
    }
    private static void help(String str1, String str2){
        List<String> re = new LinkedList<>();
        bfs(0, "", new char[str1.length()], str1, str2, 0, re);
        printOperations(re);
    }
    private static void bfs(int step, String newStr, char[] operations, String str1, String str2, int charCount, List<String> re){
        if (charCount == str2.length() && newStr.equals(str2) && step == str1.length()){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < step; i++){
                stringBuilder.append(operations[i]).append(" ");
            }
            re.add(stringBuilder.substring(0, stringBuilder.length()-1));
            return;
        }
        if (step >= str1.length()){
            return;
        }
        //delete
        operations[step] = 'd';
        bfs(step+1, newStr, operations, str1, str2, charCount, re);

        //left
        operations[step] = 'l';
        bfs(step+1, str1.charAt(step) + newStr, operations, str1, str2, charCount+1, re);

        //right
        operations[step] = 'r';
        bfs(step+1, newStr + str1.charAt(step), operations, str1, str2, charCount+1, re);
    }
    private static void printOperations(List<String> re){
        System.out.println("{");
        for (String str : re){
            System.out.println(str);
        }
        System.out.println("}");
    }
}
