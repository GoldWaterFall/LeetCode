package day03;

public class RemoveLinkedListElements {
    /**
     * Definition for singly-linked list.
     *
     **/
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /**
     *无虚拟节点和pre Node的方式
     * @param head 链表的头节点 head
     * @param val 整数 val
     * @return 返回 新的头节点
     */
    public ListNode removeElements1(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode curr = head;
        while(curr!=null){
            while(curr.next!=null && curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }

    /**
     *有虚拟节点,有preNode
     * @param head 链表的头节点 head
     * @param val 整数 val
     * @return 返回 新的头节点
     */
    public ListNode removeElements2(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1,head);
        ListNode p = dummyHead;
        ListNode q = head;
        while(q!=null){
            if(q.val==val){
               p.next=q.next;
            }else{
                p=q;
            }
            q=q.next;
        }
        return dummyHead.next;
    }

    /**
     *有虚拟节点,无pre Node
     * @param head 链表的头节点 head
     * @param val 整数 val
     * @return 返回 新的头节点
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1,head);
        ListNode p = dummyHead;
        while( p!=null && p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }else{
                p=p.next;
            }

        }
        return dummyHead.next;
    }
}
