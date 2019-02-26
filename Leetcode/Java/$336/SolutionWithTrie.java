package $336;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:50 PM 2/26/19.
 *
 * // Trie tree
 * // O(N*k)
 */
public class SolutionWithTrie {
    static class TrieNode {
        TrieNode[] next;
        int index;
        List<Integer> list;

        TrieNode() {
            next = new TrieNode[26];
            index = -1;
            list = new LinkedList<>();
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        TrieNode root = new TrieNode();
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            insert(words[i], root, i);
        }
        for (int i = 0; i < words.length; i++) {
            search(words[i], i, root, res);
        }
        return res;
    }

    private void insert(String s, TrieNode root, int index) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int idx = s.charAt(i) - 'a';
            if (root.next[idx] == null) {
                root.next[idx] = new TrieNode();
            }
            if (isPalindrome(s, 0, i)) {
                root.list.add(index);
            }
            root = root.next[idx];
        }
        root.index = index;
        root.list.add(index);
    }

    private void search(String s, int index, TrieNode root, List<List<Integer>> res) {
        for (int i = 0; i < s.length(); i++) {
            if (root.index >= 0 && root.index != index && isPalindrome(s, i, s.length() - 1)) {
                res.add(Arrays.asList(index, root.index));
            }
            int idx = s.charAt(i) - 'a';
            root = root.next[idx];
            if (root == null){
                return;
            }
        }
        for (int i : root.list) {
            if (i == index){
                continue;
            }
            res.add(Arrays.asList(index, i));
        }
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
