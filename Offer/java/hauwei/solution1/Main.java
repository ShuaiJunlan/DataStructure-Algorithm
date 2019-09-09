package hauwei.solution1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        int[] values = new int[strings.length];
        for (int i = 0; i < strings.length; i++){
            values[i] = Integer.parseInt(strings[i]);
        }
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i < values.length / 2; i++){
            minStep = Math.min(minStep, getStep(values, i));
        }
        System.out.println(minStep == Integer.MAX_VALUE ? "-1" : minStep + 1);
    }
    private static int getStep(int[] values, int start){
        int step = 0;
        while (start < values.length){
            start += values[start];
            step++;
            if (start == values.length-1){
                break;
            }
        }
        if (start != values.length-1){
            return Integer.MAX_VALUE;
        }
        return step;
    }
}
