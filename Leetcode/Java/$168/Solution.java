package $168;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:18 PM 2/23/19.
 */
public class Solution {
    public String convertToTitle(int n){
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0){
            n--;
            stringBuilder.append((char) ((n%26)+'A'));
            n /= 26;
        }
        // StringBuilder re = new StringBuilder(stringBuilder.length());
        // for (int i = stringBuilder.length()-1; i >= 0; i--){
        //     re.append(stringBuilder.charAt(i));
        // }

        return stringBuilder.reverse().toString();
    }
    // public String convertToTitle(int n) {
    //     StringBuilder result = new StringBuilder();
    //
    //     while(n>0){
    //         n--;
    //         result.insert(0, (char)('A' + n % 26));
    //         n /= 26;
    //     }
    //
    //     return result.toString();
    // }
}
