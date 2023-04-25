import java.util.*;
class Q1
{
	int queue1[]=new int[10];
	int rear,front,i,j,size=10,value;
	Q1()
	{
		rear=-1;
		front=-1;
		i=0;
		j=0;
		value=0;
	}
	int QisEmpty()
	{
		if((rear==-1 && front==-1)||(rear<front))
		{
		System.out.println("Ques is empty");
		return (-1);
		}
		else
		{
		return 0;
		}
	}
	int QisFull()
	{
		if(front==0 && rear==(size-1))
		{
		System.out.println("Queue is full");
		return (size);
		}
		else
		{
			return 0;
		}
	}
	void insertInQ()
	{
		Scanner inp=new Scanner(System.in);
		int check=QisFull();
		if(check==size)
			System.out.println("No value can be inserted in the Queue as it is Full");
		else
		{
			System.out.println("Enter a value:  ");
			if(inp.hasNextInt())
			{
				value=inp.nextInt();
			}
			if(rear==-1)
				front++;
			rear++;
			i=rear;
			queue1[i]=value;
			
		}
	}
	void deleteQ()
	{
		int check=QisEmpty();
		if(check==-1)
		{
			System.out.println("No value can be deleted from the Queue as it is empty");
		}
		else
		{
			front++;
		}
	}
	void Qprint()
	{
		System.out.println("\nThe current state of the queue is as displayed below: ");
		System.out.println("\n FRONT = "+front+"  REAR = "+rear);
		for(j=front;j<=rear;j++)
		{
			System.out.println("queue1 [ "+j+"] = "+queue1[j]);
		}
		
	}
	
}
class QueueImplement1
{
	public static void main(String []abc)
	{
		Q1 obj1=new Q1();
		obj1.deleteQ();
		obj1.insertInQ();
		obj1.insertInQ();
		obj1.insertInQ();
		obj1.insertInQ();
		obj1.Qprint();
		obj1.deleteQ();
		obj1.deleteQ();
		obj1.Qprint();
		
	}
}