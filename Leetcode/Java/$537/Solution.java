package $537;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:51 2017/3/26.
 */
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] str_a = a.split("\\+");
        int a1 = getValue(str_a[0], 1);
        int a2 = getValue(str_a[1], 2);
        String[] str_b = b.split("\\+");
        int b1 = getValue(str_b[0], 1);
        int b2 = getValue(str_b[1], 2);
//       if (a1*b1 - a2*b2 < 0)
        stringBuilder.append((a1 * b1 - a2 * b2));
//       else
//           stringBuilder.append(a1*b1 - a2*b2);
        stringBuilder.append("+");
//       if (a1*b2 + a2*b1 < 0)
        stringBuilder.append((a1 * b2 + a2 * b1) + "i");
//       else
//           stringBuilder.append((a1*b2 + a2*b1) + "i");
        return stringBuilder.toString();
    }

    public int getValue(String a, int i) {
        int a1 = 0;
        for (int j = a.length() - i; j >= 0; j--) {
            if (a.charAt(j) == '-')
                a1 = -a1;
            else
                a1 += (a.charAt(j) - '0') * (int) Math.pow(10, a.length() - i - j);
        }
        return a1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.complexNumberMultiply("1+1i", "1+1i"));
//        System.out.println(solution.complexNumberMultiply("1+-1i", "1+-1i"));
        System.out.println(solution.complexNumberMultiply("78+-76i", "-86+72i"));
    }
}
