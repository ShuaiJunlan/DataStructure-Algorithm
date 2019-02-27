package $208;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:13 PM 2/27/19.
 */
public class Trie {
    private class TrieNode{
        boolean isShowed;
        TrieNode[] children = new TrieNode[26];
    }
    private TrieNode root = new TrieNode();
    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null){
            return;
        }
        TrieNode node = root;
        for (char c : word.toCharArray()){
            if (node.children[c-'a'] == null){
                node.children[c-'a'] = new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.isShowed = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word == null){
            return false;
        }
        TrieNode node = root;
        for (char c : word.toCharArray()){
            if (node.children[c-'a'] == null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return node.isShowed;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (prefix == null){
            return false;
        }
        TrieNode node = root;
        for (char c : prefix.toCharArray()){
            if (node.children[c-'a'] == null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return true;
    }
}
