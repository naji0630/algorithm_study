import leet_code_problem.daily.ListNode;
import leet_code_problem.daily.Problem23MergekSortedLists;

public class main {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(1, listNode2);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(3, listNode4);
        ListNode listNode6 = new ListNode(1, listNode5);

        ListNode listNode7 = null;

        ListNode[] nodes = {listNode7};

        Problem23MergekSortedLists problem23MergekSortedLists = new Problem23MergekSortedLists();
        problem23MergekSortedLists.mergeKLists(nodes);


    }
}
