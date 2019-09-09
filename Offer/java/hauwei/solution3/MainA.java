package hauwei.solution3;


import java.util.*;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strs = s.split(";");
        String valueId = strs[2];
        HashMap<String, Integer> value = new HashMap<>();
        help1(value, strs[1]);
        help2(value, strs[0]);
        System.out.println(value.get(valueId));
    }

    private static void help1(Map<String, Integer> basic, String string){
        String[] strings = string.split(",");
        for (String str : strings){
            String[] strs = str.split("=");
            basic.put(strs[0], Integer.parseInt(strs[1]));
        }
    }

    private static void help2(Map<String, Integer> basic, String string){
        String[] strings = string.split(",");
        for (int i = strings.length-1; i >= 0; i--){
            String[] strs = strings[i].split("=");
            basic.put(strs[0], value(strs[1], basic));
        }
    }

    private static int value(String str,  Map<String, Integer> basic){
        char[] chars = str.toCharArray();
        LinkedList<Character> oper = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        char pre = ' ';
        for (int i = 0; i < chars.length; i++){
            int temp;
            switch (chars[i]){
                case '{':{
                    temp = str.indexOf("}", i);
                    numbers.add(Integer.parseInt(str.substring(i+1, temp)));
                    i = temp;
                    if (pre == '*' || pre == '/'){
                        if (pre == '*'){
                            numbers.push(numbers.pollLast() * numbers.pollLast());
                        }
                        if (pre == '/'){
                            int num = numbers.pollLast();
                            numbers.push(numbers.pollLast() / num);
                        }
                        oper.pollLast();
                    }
                    break;
                }
                case '[':{
                    temp = str.indexOf("]", i);
                    numbers.add(basic.get(str.substring(i, temp+1)));
                    i = temp;
                    if (pre == '*' || pre == '/'){
                        if (pre == '*'){
                            numbers.push(numbers.pollLast() * numbers.pollLast());
                        }
                        if (pre == '/'){
                            int num = numbers.pollLast();
                            numbers.push(numbers.pollLast() / num);
                        }
                        oper.pollLast();
                    }
                    break;
                }
                default:{
                    oper.add(chars[i]);
                    pre = chars[i];
                    break;
                }
            }
        }
        oper.forEach(character -> {
            if (character == '+'){
                numbers.push(numbers.pollLast() + numbers.pollLast());
            } else if (character == '-'){
                int num = numbers.pollLast();
                numbers.push(numbers.pollLast() - num);
            }
        });
        return numbers.pop();
    }
}

