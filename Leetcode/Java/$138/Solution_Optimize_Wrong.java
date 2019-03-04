package $138;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:28 AM 3/4/19.
 */
public class Solution_Optimize_Wrong {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }
        Node res = new Node();
        res.val = head.val;
        Node curr = res;
        while(head != null){
            if(head.random != null){
                Node rand = new Node();
                rand.val = head.random.val;
                curr.random = rand;
            }
            if(head.next != null){
                Node next = new Node();
                next.val = head.next.val;
                curr.next = next;
                curr = curr.next;
            }
            head = head.next;
        }
        return res;
    }
}
