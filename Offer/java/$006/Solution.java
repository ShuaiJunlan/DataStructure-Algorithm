package $006;

import datastucture.LinkNode;

public class Solution {
    public void printReverse(LinkNode root){
        if (root == null){
            return;
        }
        printReverse(root.next);
        System.out.println(root.val);
    }
}
