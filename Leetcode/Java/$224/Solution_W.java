package $224;

import java.util.LinkedList;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:16 PM 8/19/19.
 */
public class Solution_W {
    public int calculate(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        LinkedList<Character> operation = new LinkedList<>();
        LinkedList<Integer>  nums = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ' ){
                continue;
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '+' || s.charAt(i) == '-'){
                operation.push(s.charAt(i));
                if (stringBuilder.length() != 0){
                    nums.push(Integer.parseInt(stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
                continue;
            }

            if (s.charAt(i) == ')'){
                nums.push(Integer.parseInt(stringBuilder.toString()));
                stringBuilder = new StringBuilder();
                char temp;
                while (!operation.isEmpty() && (temp = operation.pop()) != '('){
                    int re = help(nums.pop(), nums.pop(), temp);
                    nums.push(re);
                }
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        if (stringBuilder.length() != 0){
            nums.push(Integer.parseInt(stringBuilder.toString()));
        }
        while (!operation.isEmpty()){
            int re = help(nums.pop(), nums.pop(), operation.pop());
            nums.push(re);
        }
        return nums.pop();
    }

    private int help(int num1, int num2, char operation){
        int re = 0;
        if (operation == '-'){
            re = num1 - num2;
        }
        if (operation == '+'){
            re = num1 + num2;
        }
        return re;
    }

    public static void main(String[] args) {
        Solution_W solutionW = new Solution_W();
        System.out.println(solutionW.calculate(" 2-1 + 2 "));
        System.out.println(solutionW.calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println(solutionW.calculate("1 + 1"));
        System.out.println(solutionW.calculate("2-(5-6)"));
    }
}
