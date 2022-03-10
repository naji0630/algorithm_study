package leet_code_problem.daily;

public class Problem2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();

        ListNode ans = head;
        ListNode a = l1;
        ListNode b = l2;
        int next = 0;


        while(!(a == null && b == null)){
            ListNode node = new ListNode();
            node.val = (a!=null ? a.val : 0) + (b!=null ? b.val : 0) + next;

            if(node.val>9){
                next = node.val/10;
                node.val = node.val%10;
            }else{
                next = 0;
            }

            if(a != null){
                a = a.next;
            }

            if(b != null){
                b = b.next;
            }

            head.next = node;
            head = head.next;
        }

        if(next != 0){
            head.next = new ListNode(next);
        }

        return ans.next;
    }
}
