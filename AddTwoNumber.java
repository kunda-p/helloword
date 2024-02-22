package leetcode;

public class AddTwoNumber {
	//주어진 ListNode 클래스
	static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
		
	public static void main(String[] args) {
			
		ListNode listStrt = new ListNode(2);
		ListNode list1 = listStrt;
		
		list1.next = new ListNode(4);
		list1 = list1.next;
		
		list1.next = new ListNode(3);
		list1 = list1.next;
		
		
		ListNode listEnd = new ListNode(5);
		ListNode list2 = listEnd;
		
		list2.next = new ListNode(6);
		list2 = list2.next;
		list2.next = new ListNode(4);
		list2 = list2.next;
		//list2 = list2.next;
		
		
		AddTwoNumber ll = new AddTwoNumber();
		
		ListNode res = ll.addTwoNumbers(listStrt, listEnd);
		
		System.out.println("11 : " +res.val);
		System.out.println("11 : " +res.next.val);
		System.out.println("11 : " +res.next.next.val);
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		
		ListNode p=l1;
		ListNode q=l2;
		ListNode cur = dummy;
		
		//노드 하나는 0~9 이므로
		//더했을 때 10이상이라면 1을 넘겨줘야함
		int carry = 0;
		
		while(p != null || q != null) {
			int x = 0;
			int y = 0;
			
			if(p != null) {
				x = p.val;
				p = p.next;
			}
			if(q != null) {
				y = q.val;
				q = q.next;
			}
			
//			System.out.println("x : " + x);
//			System.out.println("y : " + y);
//			System.out.println("carry : " + carry);
			
			int sum = x + y + carry;
			System.out.println("sum : " + sum);
			carry = sum / 10;

			
			
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			
//			if(p != null) {
//				p = p.next;
//			}
//			if(q != null) {
//				q = q.next;
//			}
			
		}
		
		if(carry > 0) cur.next =new ListNode(carry);
		
		return dummy.next;
        
    }
	
	
}
 