package $117;

import datastruc.TreeLinkNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:14 PM 3/2/19.
 */
public class Solution_Recursive {
    public void connect(TreeLinkNode root) {
        compute(root);

    }

    private void compute(TreeLinkNode cur){
        if(cur==null){
            return;
        }
        TreeLinkNode temp = cur.next;
        while(temp!=null){
            if(temp.left!=null){
                temp=temp.left;
                break;
            }
            if(temp.right!=null){
                temp=temp.right;
                break;
            }

            temp=temp.next;
        }

        if(cur.right!=null){
            cur.right.next=temp;
        }
        if(cur.left!=null) {
            cur.left.next = (cur.right != null ? cur.right : temp);
        }
        compute(cur.right);
        compute(cur.left);
    }
}
