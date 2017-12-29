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
	public static void main(String[] args)
	{
		for(int i=0; i < 10; i++)
		{
			insertAtFront(i);
		}
		print(head);
		
	}

}
