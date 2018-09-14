package com.leetcode;


/**
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 * @author zhangH
 *
 */
public class AAACaddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
		ListNode temp = result;
		int carry = 0;
		
		while (l1 != null || l2 != null || carry != 0) {
			temp.next = new ListNode(0);
			temp = temp.next;
			int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			temp.val = sum % 10;
			carry = sum / 10;
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		if (l1 != null) {
			temp = l1;
		} else temp = l2;
		return result.next;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; } 
}