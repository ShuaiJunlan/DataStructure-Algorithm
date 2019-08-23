package beike;

import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:37 PM 8/23/19.
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        String t = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(t);

        for (int i = 1; i < t.length(); i++){
            if (t.charAt(i) != t.charAt(i-1)){
                break;
            }else {
                if (i == t.length() - 1){
                    for (int j = 1; j < k; j++){
                        stringBuilder.append(t.charAt(0));
                    }
                    System.out.println(stringBuilder.toString());
                    return;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= (n + 1 >> 1); i++){
            if (isEquals(t, i)){
                count = i;
            }
        }
        if (count == 0){
            for (int j = 1; j < k; j++){
                stringBuilder.append(t);
            }
        }else {
            for (int j = 1; j < k; j++){
                stringBuilder.append(t.substring(count));
            }
        }
        System.out.println(stringBuilder.toString());
    }

    private static boolean isEquals(String s, int i){
        return s.substring(0, i).equals(s.substring(s.length() - i));
    }
}
