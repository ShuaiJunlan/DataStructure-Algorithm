package $043;

import java.math.BigInteger;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:20 2018/5/17.
 */
public class Solution {
    public String multiply(String num1, String num2) {
        String[] aa = num1.split("\"");
        String[] bb = num2.split("\"");
        BigInteger a, b;
        a = new BigInteger(aa[1]);
        b = new BigInteger(bb[1]);
        return a.multiply(b).toString();
    }
}
