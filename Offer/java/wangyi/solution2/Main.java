package wangyi.solution2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            System.out.println(help(scanner.nextLong(), scanner.nextLong(), scanner.nextLong(), scanner.nextLong()));
        }
    }
    private static long help(long A, long B, long p, long q){
        double re = (B-A) / (double)p;
        long i = 0;
        long temp = 0;
        while (temp < re){
            temp = (long) Math.pow(q, i);
            i++;
        }
        return i;
    }
}
