package bytedance.solution2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        int target = Integer.parseInt(strs[strs.length-1]);
        int[] nums = new int[strs.length-1];
        for (int i = 0; i < strs.length-1; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(getMin(nums, target));
    }
    private static int getMin(int[] arrs, int target){
        int[] temp = new int[arrs.length];

        return 0;
    }
}
