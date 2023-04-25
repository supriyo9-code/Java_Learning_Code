class LinkNode
{
	int d;
	LinkNode next;
	LinkNode(int x)
	{
		d=x;
		next= null;
	}
	public void displayNode()
	{
		System.out.println(d);
	}
}
class Linked_List
{
	private LinkNode head;
	public Linked_List()
	{
		head = null;
	}
	public boolean is_Empty()
	{
		return(head==null);
	}
	public void InsertElement(int value)
	{
		LinkNode newNode=new LinkNode(value);
		newNode.next=head;
		head=newNode;
	}
	public void display_Node()
	{
		LinkNode start=head;
		while(start!=null)
		{
			start.displayNode();
			start=start.next;
		}
	}
}
class Linked_List_Implement
{
	public static void main(String[] args)
	{
		Linked_List obj1=new Linked_List();
		obj1.InsertElement(10);
		obj1.InsertElement(20);
		obj1.InsertElement(50);
		obj1.display_Node();
	}
}