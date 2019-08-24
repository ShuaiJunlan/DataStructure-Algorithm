package jingdong;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int countMan = 0, countWoman = 0;
        Set<Integer> man = new HashSet<>(), woman = new HashSet<>();
        for (int i = 0; i < m; i++){
            man.add(scanner.nextInt());
            woman.add(scanner.nextInt());
        }
//        if (man.size() < woman.size()){
            System.out.println(man.size());

            String[] strings = new String[man.size()];
            Iterator<Integer> iterator = man.iterator();
            int i = 0;
            while (iterator.hasNext()){
                strings[i++] = String.valueOf(iterator.next());
            }
            for (String str : strings){
                System.out.print(str + " ");
            }
//        }else {
//            System.out.println(woman.size());
//
//            String[] strings = new String[woman.size()];
//            Iterator<Integer> iterator = woman.iterator();
//            int i = 0;
//            while (iterator.hasNext()){
//                strings[i++] = String.valueOf(iterator.next());
//            }
//            for (String str : strings){
//                System.out.print(str + " ");
//            }
//        }

    }
    private static void help(){

    }
    private static int getWomanNum(int i, int n){
        return i - n;
    }
}
