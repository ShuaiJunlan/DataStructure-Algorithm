package $367;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:05 PM 10/28/19.
 */
public class Solution1 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
