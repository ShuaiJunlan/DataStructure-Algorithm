package jingdong;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int min = Math.min(o1.length(), o2.length());
                for (int i =0; i < min; i++){
                    if (o1.charAt(i) > o2.charAt(i)){
                        return 1;
                    }else if (o1.charAt(i) < o2.charAt(i)){
                        return -1;
                    }
                }
                if (o1.length() > o2.length()){
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        priorityQueue.add("2");
        priorityQueue.add("13");
        priorityQueue.add("1");

        String[] strings = new String[]{"2", "13", "1"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Iterator<String> iterator1 = priorityQueue.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }
    }
}
