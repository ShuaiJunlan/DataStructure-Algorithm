package $299;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:45 PM 9/26/19.
 */
public class Solution {
    public String getHint(String secret, String guess) {
        if (secret == null || guess == null){
            return "0A0B";
        }
        int[] a = new int[10], b = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++){
           if (secret.charAt(i) == guess.charAt(i)){
               bulls++;
           }
           a[secret.charAt(i)-'0']++;
           b[guess.charAt(i)-'0']++;
        }
        for (int i = 0; i < a.length; i++){
            cows += Math.min(a[i], b[i]);
        }
        return bulls + "A" + (cows-bulls) + "B";
    }
}
