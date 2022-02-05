package leet_code_problem.daily;

public class Problem23MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode mergedList = null;

        if(lists.length == 0){
            return mergedList;
        }else if(lists.length == 1){
            return lists[0];
        }else{
            mergedList = lists[0];
            for(int i=0; i<lists.length-1; i++){
                mergedList = merge(mergedList, lists[i+1]);
            }
        }
        return mergedList;

    }

    public ListNode merge(ListNode node1, ListNode node2){

        if(node1 == null){
            return node2;
        }
        if(node2 == null){
            return node1;
        }

        if(node1.val < node2.val){
            return new ListNode(node1.val,merge(node1.next, node2));
        }else{
            return new ListNode(node2.val, merge(node1, node2.next));
        }
    }
}
