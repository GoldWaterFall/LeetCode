package day03;


class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    int size=0;
    ListNode head;

    public MyLinkedList() {
        head=new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode p = head;
        for (int i = 0; i < index+1; i++) {
            p=p.next;
        }
        return p.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index<0){
            index = 0;
        }
        size++;
        ListNode p = head;
        ListNode add = new ListNode(val);
        for (int i = 0; i < index; i++) {
            p=p.next;
        }
        ListNode temp=p.next;
        p.next=add;
        add.next=temp;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode pred = head;
        for (int i = 0; i < index ; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}
