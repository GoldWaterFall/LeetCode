package day03;



public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
      ListNode p =null;
      ListNode c = head;
      ListNode temp=null;
      while(c != null){
         temp = c.next;
         c.next=p;
         p=c;
         c=temp;
      }
        return p;
    }
}
