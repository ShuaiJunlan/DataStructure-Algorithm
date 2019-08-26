package jingdong;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        help(str);
    }
    private static void help(String str){
        String[] strs = str.split(" ");
        int[] height = new int[strs.length];
        for (int i = 0; i < strs.length; i++){
            height[i] = Integer.parseInt(strs[i]);
        }
        int[] temp = new int[strs.length];
        System.arraycopy(height, 0, temp, 0, height.length);
        Arrays.sort(temp);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < temp.length; i++){
            set1.add(height[i]);
            set2.add(temp[i]);
            if (compare(set1, set2)){
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean compare(Set<Integer> set1, Set<Integer> set2){
        Iterator<Integer> iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            int temp = iterator1.next();
            if (set2.remove(temp)){
                iterator1.remove();
            }
        }
        if (set1.size() == 0 && set2.size() == 0){
            return true;
        }
        return false;
    }
}
