package pinduoduo.solution1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(";");
        String[] numStrs = strings[0].split(",");
        int[] nums = new int[numStrs.length];
        int i = 0;
        for (String s:numStrs){
            nums[i++] = Integer.parseInt(s);
        }
        help(nums, Integer.parseInt(strings[1]));
    }
    private static void help(int[] nums, int n){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 != 0){
                    return -1;
                }
                if (o1 % 2 != 0 && o2 % 2 == 0){
                    return 1;
                }
                return o2.compareTo(o1);
            }
        });

        for (int num : nums) {
            priorityQueue.add(num);
        }
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty() && j < n){
            stringBuilder.append(priorityQueue.poll()).append(",");
            j++;
        }
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.length()-1));
    }
}
