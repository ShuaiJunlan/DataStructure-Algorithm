package jingdong;

import java.util.*;

public class Solution1Bak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int total = 0;
        String[] strs = str.split(" ");
        int[] h = new int[strs.length];
        for (int i = 0; i < strs.length; i++){
            h[i] = Integer.parseInt(strs[i]);
        }
        int[] t = new int[strs.length];
        System.arraycopy(h, 0, t, 0, h.length);
        Arrays.sort(t);
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int i = 0; i < t.length; i++){
            set1.add(h[i]);
            set2.add(t[i]);
            if (equals(set1, set2)){
                total++;
            }
        }
        System.out.println(total);
    }
    private static boolean equals(Set<Integer> s1, Set<Integer> s2){
        Iterator<Integer> iterator1 = s1.iterator();
        while (iterator1.hasNext()){
            if (s2.remove(iterator1.next())){
                iterator1.remove();
            }
        }
        if (s2.size() == 0 && s2.size() == 0){
            return true;
        }
        return false;
    }
}
