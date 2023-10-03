package day04;


public class SwapNodesInPairs {
    /**
     *递归方法
     * @param head 给定链表头结点
     * @return 返回交换后的链表
     */
    public ListNode swapPairs1(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode next = head.next;
        ListNode newNode = swapPairs1(next.next);
        next.next=head;
        head.next=newNode;

        return next;
    }

    /**
     *虚拟结点+指针方法
     * @param head 给定链表头结点
     * @return 返回交换后的链表
     */
    public ListNode swapPairs2(ListNode head) {
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next=head;
        ListNode cur = dummyhead;
        ListNode temp;
        ListNode firstnode;
        ListNode secondnode;
        while (cur.next!=null && cur.next.next!=null){
            temp=cur.next.next.next;
            firstnode = cur.next;
            secondnode= cur.next.next;
            cur.next=secondnode;
            secondnode.next=firstnode;
            firstnode.next=temp;
            cur=firstnode;
        }
        return dummyhead.next;
    }
}
