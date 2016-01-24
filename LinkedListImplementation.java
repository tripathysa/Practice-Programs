import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
	int data;
	Node next;
/*	public Node(int data)
	{
		this.data=data
	}*/
}
class LinkList
{
	private Node head;
	public LinkList()
	{
		head = null;
	}
	
	//check if list is empty
	public boolean isEmpty()
	{
		return head == null;
	}
	
	//Linked list traversal
	public void traverseLinkedList()
	{

			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println("");
	}
	
	//Count the number of elements of the list
	public void countNodes()
	{
		int count =0;

			Node temp=head;
			while(temp!=null)
			{
				count=count+1;
				temp=temp.next;
			}
			System.out.println("Number of nodes in the list is" + " " + count);
	}
		
	
	//Add node to beginning
	public void addNodeStart(int data)
	{	
	    Node newnode=new Node();
		newnode.data=data;
		if(head==null)
		{
			head=newnode;
			head.next=null;
		}
		else
		{
			Node temp=head;
			head=newnode;
			head.next=temp;
		}	  
	}
	
	
	//Add node to end
	public void addNodeEnd(int data)
	{	
	    Node newnode=new Node();
		newnode.data=data;
		if(head==null)
		{
			head=newnode;
			head.next=null;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=null;
		}	  
	}
		
	//Add node at any given position
	public void addNodeAtPosition(int data,int position)
	{	
	    int count=1;
	    Node newnode=new Node();
		newnode.data=data;
		if(head==null)
		{
			head=newnode;
			head.next=null;
		}
		else
		{
			Node temp=head;
			Node temp1;
			while(count<position-1)
			{
				temp=temp.next;
				count++;
			}
			temp1=temp.next;
			temp.next=newnode;
			newnode.next=temp1;
		}	  
	}	
	
    //Delete node from beginning
	public void deleteNodeStart()
	{	
	System.out.println(head.data);
	System.out.println(head.next);
	System.out.println(head==null);
	System.out.println(head.next==null);
	 if(head==null)
	 {
		 System.out.println("No nodes to delete deleteNodeStart");
		 
	 }
	 else if(head.next==null)
	 {
		 head=null;
	 }
     else
	 {
		   head=head.next;
	 }	 
            
			
	}	
	
	//Delete node from end
	public void deleteNodeEnd()
	{	
	 if(head==null)
	 {
		 System.out.println("No nodes to delete deleteNodeStart");
		 
	 }
	 else if(head.next==null)
	 {
		 head=null;
	 }
	 else{
			Node temp=head;
			Node previous=temp;
			while(temp.next!=null)
			{
				previous=temp;
				temp=temp.next;
			}
			previous.next=null;
	     }
	}
	
	//Delete node from any given position
	public void deleteNodeAtposition(int position)
	{
		int count=1;
		Node temp=head;
		Node prev=temp;
		while(count<position)
		{
			prev=temp;
   		    temp=temp.next;
			count++;	
		}
		prev.next=temp.next;
		
	}
}
class LinkedListImplementation
{
	public static void main(String[] args)
	{
		LinkList linkedlistend = new LinkList();
		linkedlistend.addNodeEnd(2);
		linkedlistend.addNodeEnd(7);
        linkedlistend.addNodeEnd(13);
		linkedlistend.addNodeEnd(10);
		linkedlistend.addNodeEnd(9);
		if(!(linkedlistend.isEmpty()))
		{
			linkedlistend.traverseLinkedList();
			linkedlistend.countNodes();
		}
		
	    LinkList linkedliststart = new LinkList();
		linkedliststart.addNodeStart(2);
		linkedliststart.addNodeStart(7);
		linkedliststart.addNodeStart(13);
		linkedliststart.addNodeStart(10);
		linkedliststart.addNodeStart(9);
		if(!(linkedliststart.isEmpty()))
		{
			linkedliststart.traverseLinkedList();
			linkedliststart.countNodes();
		}
//		linkedlistend.addNodeAtPosition(41,4);
//		linkedlistend.traverseLinkedList();
		
//	    linkedlistend.deleteNodeEnd();
//		linkedlistend.deleteNodeEnd();
//		linkedlistend.deleteNodeStart();
//		linkedlistend.traverseLinkedList();
		linkedlistend.deleteNodeAtposition(2);
		linkedlistend.traverseLinkedList();
		
	}
}