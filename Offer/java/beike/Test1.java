package beike;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:21 PM 8/23/19.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(isEquals("aaabaaab", 4));
    }
    private static boolean isEquals(String s, int i){
        return s.substring(0, i).equals(s.substring(s.length() - i));
    }
}
