package $811;

import java.util.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:27 2018/4/1.
 */
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        if (cpdomains == null){
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<>(10);
        for (int i = 0; i < cpdomains.length; i++){
            String[] a = cpdomains[i].split(" ");
            String[] b = a[1].split("\\.");
            String temp = "";
            for (int j = b.length - 1; j >= 0; j--){
                if (temp.length() == 0){
                    temp = b[j] + temp;
                }else {
                    temp = new StringBuilder(b[j]).append(".").append(temp).toString();
                }

                if (hashMap.containsKey(temp)){
                    int value = hashMap.get(temp);
                    value = value + Integer.valueOf(a[0]);
                    hashMap.put(temp, value);
                }else {
                    hashMap.put(temp, Integer.valueOf(a[0]));
                }
            }
        }
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator.next();
            linkedList.add(entry.getValue() + " " + entry.getKey());
        }
        return linkedList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"9001 discuss.leetcode.com"};
        solution.subdomainVisits(arr);
    }
}
