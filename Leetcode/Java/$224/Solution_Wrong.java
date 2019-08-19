package $224;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:16 PM 8/19/19.
 */
public class Solution_Wrong {
    public int calculate(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int result = 0;
        char preOperation = '+';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ' || s.charAt(i) == '(' || s.charAt(i) == ')'){
                continue;
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-'){
                if (preOperation == '+'){
                    result += Integer.parseInt(stringBuilder.toString());
                }else {
                    result -= Integer.parseInt(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
                preOperation = s.charAt(i);
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        if (preOperation == '+'){
            result += Integer.parseInt(stringBuilder.toString());
        }else {
            result -= Integer.parseInt(stringBuilder.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        Solution_Wrong solution = new Solution_Wrong();
        System.out.println(solution.calculate(" 2-1 + 2 "));
        System.out.println(solution.calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println(solution.calculate("1 + 1"));
        System.out.println(solution.calculate("2-(5-6)"));
    }
}
