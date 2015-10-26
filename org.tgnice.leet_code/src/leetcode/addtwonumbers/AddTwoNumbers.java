package leetcode.addtwonumbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
	private ListNode addNode;
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		addNode = new ListNode(l1.val+l2.val);
		ListNode travel = addNode;
		ListNode l1Travel = l1;
		ListNode l2Travel = l2;
		int a;
		int b;
		int over = 0;
		while( (l1Travel.next != null) || (l2Travel.next != null) || over != 0){
			a = l1Travel.next == null ? 0: l1Travel.next.val;
			b = l2Travel.next == null ? 0: l2Travel.next.val;
			over = over + a + b;
			travel.next = new ListNode((over)%10);
			travel = travel.next;
			over = (over)/10;
			if(l1Travel.next != null){ l1Travel = l1Travel.next;}
			if(l2Travel.next != null){ l2Travel = l2Travel.next;}
		}
		travel.next = null;
		return addNode;
    }
    
    public static void main(String[] args){
    	AddTwoNumbers atn = new AddTwoNumbers();
    }
}
