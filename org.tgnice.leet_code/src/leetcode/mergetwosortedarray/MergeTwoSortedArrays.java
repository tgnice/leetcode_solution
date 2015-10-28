package leetcode.mergetwosortedarray;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedArrays {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode merged = new ListNode(0);
    	ListNode tail = merged;
    		
    	while(l1 != null && l2 != null){
    		if(l1.val < l2.val){
    			tail.next = new ListNode(l1.val);
    			l1 = l1.next;
    		} else{
    			tail.next = new ListNode(l2.val);
    			l2 = l2.next;
    		}
    		tail = tail.next;
    	}
    	tail.next = null;
    	
		if(l1 == null && l2 != null){
			tail.next = l2;
		} else if( l2 == null && l1 != null){
			tail.next = l1;
		}
    	merged = merged.next;
    	return merged;
    }
    public static void main(String[] args){
    	MergeTwoSortedArrays mta = new MergeTwoSortedArrays();
    }
}
