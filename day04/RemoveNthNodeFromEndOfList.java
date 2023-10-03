package day04;

public class RemoveNthNodeFromEndOfList {
    /**
     * 双指针定位
     * @param head 链表
     * @param n 要删除倒数第n个节点
     * @return 返回删除后的链表
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next=head;
        ListNode pre = dummyhead;
        ListNode cur = dummyhead;
        for (int i = 0; i < n; i++) {
            cur=cur.next;
        }
        while(cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=pre.next.next;
        return dummyhead.next;
    }
}
