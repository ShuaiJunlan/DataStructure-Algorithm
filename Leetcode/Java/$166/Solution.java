package $166;

import java.util.HashMap;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 12:30 PM 2/23/19.
 */
public class Solution {
    public String fractionToDecimal(int numerator, int denominator){
        assert denominator != 0;
        if (numerator == 0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        res.append((numerator > 0) ^ (denominator > 0) ? "-" : "");

        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        res.append(num / den);
        num %= den;
        if (num == 0){
            return res.toString();
        }

        res.append(".");

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());
        while (num != 0){
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)){
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                return res.toString();
            }else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println((double) 4/9);
        System.out.println((double) 4/333);
    }
}
