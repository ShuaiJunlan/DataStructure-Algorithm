package douyu;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    String a = "ddd";
    public static void main(String[] args) {
        System.out.println("hello");
        Map<Integer, Integer> map = new HashMap<>();

        Solution solution = new Solution();
        solution.exchange(solution.a);
        System.out.println(solution.a);
        solution.a = "ttt";
        System.out.println(solution.a);

        Parent son = new Son();
        Daughter daughter = (Daughter) son;

    }
    public void exchange(String a){
        a = "ggg";
    }
}
