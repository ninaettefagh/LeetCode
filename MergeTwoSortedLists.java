class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        if (list2 == null){
            return list1;
        }
        if (list1 == null){
            return list2;
        }

        if(list1.val <= list2.val) {
            merged.val = list1.val;
            merged.next = mergeTwoLists(list1.next, list2);
        } else {
            merged.val = list2.val;
            merged.next = mergeTwoLists(list1, list2.next);
        }

        return merged;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode next = new ListNode();

        l1.val = 1;

        ListNode l2 = new ListNode();
        l2.val = 1;
        ListNode merge = mergeTwoLists(l1, l2);
        System.out.println(merge.val );

    }
}
