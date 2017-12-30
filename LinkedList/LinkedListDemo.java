package LinkedList;

public class LinkedListDemo {
	static Node head = null; 
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	public static void insertAtFront(int i)
	{
		Node temp = new Node(i);
		if(head != null)
		{
			temp.next = head;
			head = temp;
		}
		head = temp;
	}
	
	public static void print(Node head)
	{
		Node curr = head;
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public static void appendAtLast(int data)
	{
		Node temp1= new Node(data);
		if(head == null)
		{
			head = temp1;
			return;
		}
		Node curr = head;
		while(curr.next!= null)
		{
			curr = curr.next;
		}
		curr.next = temp1;
		return;
	}
	public static void midpointOfLinkedList(Node head)
	{
		Node slow_pointer = head;
		Node fast_pointer = head;
		
		while(fast_pointer != null && fast_pointer.next != null)
		{
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
		}
		System.out.println("the mid point is " + slow_pointer.data);
	}
	
	public static void insertNodeAtGivenPosition(int n, int data)
	{
		Node temp =  new Node(data);
		if(n ==1 )
		{
			temp.next = head.next;
			head = temp;
		}
		
		Node curr = head;
        int i=0;
		while(i < n-2)
		{
			curr = curr.next;
			i++;
		}
		temp.next = curr.next;
		curr.next = temp;
		return;
	}
	
	public static void deleteNodeAtGivenPosition(int n)
	{
		Node curr = head;
		if(n==1)
		{
			head = curr.next;
		}
		
	    for(int i=0; i < n-2; i++)
	    {
	    	curr =  curr.next;
	    }
	    curr.next = curr.next.next;	    		
	}
	
	public static int isElementPresent(Node head, int x, int count)
	{
		Node curr = head;
		if(curr == null)
		{
			return -1;
		}
		if(curr.data == x)
		{
			return count;
		}
		System.out.println("count is " + count);
		return isElementPresent(curr.next, x, count+1);
	}
	
	public static int lengthOfLinkedListRecursive(Node curr)
	{
		if(curr == null)
		{
			return 0;
		}
		
		return 1+lengthOfLinkedListRecursive(curr.next);
		
	}
	
	public static void makeMiddleNodeAsHead(Node head)
	{
		Node curr = head;
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node prev_node = slow_ptr;
		while(fast_ptr != null && fast_ptr.next != null)
		{
			prev_node = slow_ptr;
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		prev_node.next = null;
		head = slow_ptr;
	}
	public static void main(String[] args)
	{
		for(int i=0; i < 10; i++)
		{
			insertAtFront(i);
		}
		appendAtLast(100);
		print(head);
		midpointOfLinkedList(head);
		insertNodeAtGivenPosition(4,100000000);
		print(head);
	    deleteNodeAtGivenPosition(1);
	    System.out.println("The deleted list is ");
	    print(head);
	    System.out.println("The index of 2 is " + isElementPresent(head, 2, 0));
	    System.out.println("The length of linked list is " + lengthOfLinkedListRecursive(head));
	    makeMiddleNodeAsHead(head);
	    System.out.println("The new list is ");
	    print(head);
	}

}
