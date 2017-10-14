package $383;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:25 2017/3/26.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] maga = magazine.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < maga.length; i++) {
            arr[maga[i] - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (arr[ransomNote.charAt(i) - 'a'] > 0)
                arr[ransomNote.charAt(i) - 'a']--;
            else
                return false;
        }
        return true;

    }
}
