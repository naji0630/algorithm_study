package leet_code_problem.daily;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print(){
        ListNode temp = this;
        System.out.println(temp.val);
        while(temp.next != null){
            temp = temp.next;
            System.out.println(temp.val);
        }
    }
}