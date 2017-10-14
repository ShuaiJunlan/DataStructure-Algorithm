package datastructure;

import com.sh.leetcoder.datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:52 2017/3/26.
 */
public class BinaryTreeUtil {
    public final static TreeNode createBinaryTree(List<TreeNode> list) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        TreeNode root = null;
        if (linkedList.isEmpty())       //  捕获空链表异常
            return root;
        root = linkedList.pollFirst();
//        if (linkedList.pollFirst() == null)

        return null;
    }
}
