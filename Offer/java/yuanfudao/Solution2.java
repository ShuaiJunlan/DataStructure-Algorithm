package yuanfudao;

import java.util.*;
import java.util.function.Consumer;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
//        scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++){
            int k = scanner.nextInt();
            int[] temp = new int[k];
            for (int j = 0; j < k; j++){
                temp[j] = scanner.nextInt();
            }
//            stringBuilder.append(help(scanner.nextLine())).append(" ");
            list.add(help1(temp));
//            System.out.println(help(scanner.nextLine()));
        }
        list.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
//        System.out.println(stringBuilder.toString().substring(0, stringBuilder.length()-1));
    }
    private static int help1(int[] num){
        Arrays.sort(num);
        int total = 0;
        while (true){
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < num.length - 2; i++){
                total += num[i];
                num[i] = 0;
                set.add(i);
                num[i+1] = num[i+1] - num[i];
                if (num[i+1] == 0){
                    set.add(i+1);
                }
                num[i+2] = num[i+2] - num[i];
                if (num[i+2] == 0){
                    set.add(i+2);
                }

            }
            if (set.size() >= num.length-2){
                return total;
            }
            Arrays.sort(num);

        }

    }
    private static int help(String str){
        String[] strings = str.split(" ");
        int roles = Integer.parseInt(strings[0]);
//        int roles = Integer.parseInt(" ");
        int[] num = new int[roles];
        int j = 0;
        for (int i = 1; i < strings.length; i++){
            if (strings[i].equals("")){
                continue;
            }
            num[j++] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(num);
        int total = 0;
        for (int i = 0; i < num.length - 2; i++){
            total += num[i];
            num[i+1] = num[i+1] - num[i];
            num[i+2] = num[i+2] - num[i];
        }
        return total;
    }
}
