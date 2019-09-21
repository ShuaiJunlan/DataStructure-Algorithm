package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:16 AM 9/9/19.
 *
 * reference: http://www.ruanyifeng.com/blog/2013/05/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm.html
 */
public class KMP {
    private int[] calculateMaxMatchLengths(String pattern){
        if (Objects.isNull(pattern) || pattern.length() == 0){
            return new int[0];
        }
        int[] maxMatchLengths = new int[pattern.length()];
        for (int i = 1; i < pattern.length(); i++){
            for (int j = 0; j < i; j++){
                if (pattern.substring(0, j+1).equals(pattern.substring(i-j, i+1))){
                    maxMatchLengths[i] = j + 1;
                }
            }
        }
        return maxMatchLengths;
    }
    public List<Integer> search(String source, String pattern){
        if (Objects.isNull(source) || Objects.isNull(pattern) || source.isEmpty() || pattern.isEmpty()){
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        int[] maxMatchLengths = calculateMaxMatchLengths(pattern);
        for (int i = 0; i < source.length();){
            int temp = i;
            for (int j = 0; j < pattern.length();){
                if (temp >= source.length() || source.charAt(temp) != pattern.charAt(j)){
                    if (j == 0){
                        i++;
                    }else {
                        i += (j - maxMatchLengths[j-1]);
                    }
                    break;
                }else {
                    temp++;
                    j++;
                }
            }
            if (temp - i == pattern.length()){
                list.add(i);
                i += (pattern.length() - maxMatchLengths[pattern.length()-1]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        System.out.println(Arrays.toString(kmp.calculateMaxMatchLengths("ABCDABD")));
        System.out.println(kmp.search("BBCABCDABABCDABCDABDE", "ABCDABD"));
        System.out.println(kmp.search("AAAA", "AA"));
    }
}
