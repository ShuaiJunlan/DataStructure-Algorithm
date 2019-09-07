    package hauwei.solution3;

    import java.util.*;
    import java.util.function.Consumer;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            String[] strings = string.split(";");
            String valueId = strings[2];
            HashMap<String, Integer> basic = new HashMap<>();
            getBasic(basic, strings[1]);
            getTarget(basic, strings[0]);
            System.out.println(basic.get(valueId));
        }

        private static void getBasic(Map<String, Integer> basic, String string){
            String[] strings = string.split(",");
            for (String str : strings){
                String[] strs = str.split("=");
                basic.put(strs[0], Integer.parseInt(strs[1]));
            }
        }

        private static void getTarget(Map<String, Integer> basic, String string){
            String[] strings = string.split(",");
            for (int i = strings.length-1; i >= 0; i--){
                String[] strs = strings[i].split("=");
                basic.put(strs[0], getValue(strs[1], basic));
            }
        }

        private static int getValue(String str,  Map<String, Integer> basic){
            char[] chars = str.toCharArray();
            LinkedList<Character> operation = new LinkedList<>();
            LinkedList<Integer> nums = new LinkedList<>();
            char pre = ' ';
            for (int i = 0; i < chars.length; i++){
                int temp;
                switch (chars[i]){
                    case '[':{
                        temp = str.indexOf("]", i);
                        nums.add(basic.get(str.substring(i, temp+1)));
                        i = temp;
//                        if (pre == '*' || pre == '/'){
//                            if (pre == '*'){
//                                nums.push(nums.pollLast() * nums.pollLast());
//                            }
//                            if (pre == '/'){
//                                int num = nums.pollLast();
//                                nums.push(nums.pollLast() / num);
//                            }
//                            operation.pollLast();
//                        }
                        break;
                    }
                    case '{':{
                        temp = str.indexOf("}", i);
                        nums.add(Integer.parseInt(str.substring(i+1, temp)));
                        i = temp;
//                        if (pre == '*' || pre == '/'){
//                            if (pre == '*'){
//                                nums.push(nums.pollLast() * nums.pollLast());
//                            }
//                            if (pre == '/'){
//                                int num = nums.pollLast();
//                                nums.push(nums.pollLast() / num);
//                            }
//                            operation.pollLast();
//                        }
                        break;
                    }
                    default:{
                        pre = chars[i];
                        operation.add(chars[i]);
                    }
                }
            }
            LinkedList<Integer> numsBak = new LinkedList<>();
            Iterator<Character> iterator = operation.iterator();
            while (iterator.hasNext()){
                char character = iterator.next();
                if (character == '*'){
                    numsBak.push(nums.pop() * nums.pop());
                    iterator.remove();
                } else if (character == '/'){
                    int num = nums.pop();
                    numsBak.push(num/ nums.pop());
                    iterator.remove();
                } else {
                    numsBak.push(nums.pop());
                }
            }
            if (!nums.isEmpty()){
                numsBak.push(nums.pop());
            }

            operation.forEach(new Consumer<Character>() {
                @Override
                public void accept(Character character) {
                    if (character == '+'){
                        nums.push(numsBak.pollLast() + numsBak.pollLast());
                    }
                    if (character == '-'){
                        int num = numsBak.pollLast();
                        nums.push(numsBak.pollLast() - num);
                    }
                }
            });

            return nums.pop();
        }
    }
