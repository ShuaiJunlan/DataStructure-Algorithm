package wangyi.solution1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println(help(scanner.nextInt()).reverse().toString());
        }
    }
    private static StringBuilder help(int sum){
        StringBuilder stringBuilder = new StringBuilder();
        while (sum != 0){
            if (sum > 9){
                stringBuilder.append(9);
                sum -= 9;
            }else {
                stringBuilder.append(sum);
                sum = 0;
            }
        }
        return stringBuilder;
    }
}
