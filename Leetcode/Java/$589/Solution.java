package $589;

import datastruc.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 5:02 PM 2018/09/13.
 */
public class Solution {
    public List<Integer> preorder(Node root){
        List<Integer> list = new ArrayList<>();
        // recursive(root, list);
        iteratively(root, list);
        return list;
    }
    private void recursive(Node head, List<Integer> integerList){
        if (head != null){
            integerList.add(head.val);
            for (Node node1 : head.children){
                recursive(node1, integerList);
            }
        }
    }
    private void iteratively(Node head, List<Integer> integerList){
        LinkedList<Node> linkedList = new LinkedList();
        while (head != null){
            integerList.add(head.val);
            if (head.children.size() > 0){
                Node temp = head.children.remove(0);
                for (int i = head.children.size() - 1; i >= 0; i--){
                    linkedList.add(head.children.get(i));
                }
                head = temp;
            } else if (!linkedList.isEmpty()){
                head = linkedList.removeLast();
            }else {
                head = null;
            }
        }
    }
}
