package bytedance.solution3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), q = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        while (q > 0) {
            q--;
            System.out.println(getValue(strings, scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int getValue(String[] strings, int begin, int end) {
        boolean right = false, left = false;
        int rightIndex = -1, leftIndex = -1;
        for (int i = begin; i <= end; i++) {
            if (strings[i].equals(">")) {
                right = true;
                rightIndex = i;
            } else if (strings[i].equals("<")) {
                if (!strings[i-1].equals(">")){
                    left = true;
                    leftIndex = i;
                    break;
                }
            }
        }
        int total = 0;
        if (!left){
            for (int i = begin; i <= end; i++){
                if (!(strings[i].equals(">") || strings[i].equals("<"))){
                    total += Integer.parseInt(strings[i]);
                }
            }
        }
        if (left){
            if (right){
                for (int i = begin; i <= leftIndex; i++){
                    if (!(strings[i].equals(">") || strings[i].equals("<"))){
                        total += Integer.parseInt(strings[i]);
                    }

                }
            }else {
                for (int i = begin; i <= leftIndex; i++){
                    if (!(strings[i].equals(">") || strings[i].equals("<"))){
                        total += (Integer.parseInt(strings[i]) * 2);
                        total--;
                    }
                }
            }

        }
        return total;
    }
}
