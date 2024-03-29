

  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int carry = 0;
        while(l1 != null || l2!=null){
            int x = l1 !=null ? l1.val : 0;
            int y = l2 !=null ? l2.val : 0;
            int sum = x+y+carry;
            int digit = sum%10;
            carry = sum/10;
            pointer.next = new ListNode(digit);
            pointer = pointer.next;
            if (l1 != null) l1 = l1.next;
            if(l2 != null) l2=l2.next;

        }
        if (carry>0){
            pointer.next = new ListNode(carry);
        }
        return result.next;
    }
}