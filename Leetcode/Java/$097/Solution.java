package $097;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:23 AM 2018/07/16.
 *
 * DFS solution
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
        int m = s1.length(), n = s2.length();
        if(m + n != s3.length()){
            return false;
        }
        return dfs(c1, c2, c3, 0, 0, 0, new boolean[m + 1][n + 1]);
    }
    public boolean dfs(char[] a, char[] b, char[] c, int startA, int startB, int startC, boolean[][] invalid){
        if (invalid[startA][startB]){
            return false;
        }
        if (startC == c.length){
            return true;
        }
        boolean valid = startA < a.length && a[startA] == c[startC] && dfs(a, b, c, startA+1, startB ,startC+1, invalid) ||
                startB < b.length && b[startB] == c[startC] && dfs(a, b, c, startA, startB+1, startC+1, invalid);
        if (!valid){
            invalid[startA][startB] = true;
        }
        return valid;
    }

}
