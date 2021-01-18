public class DoublyLinkedList {
	Node head; 
	
	//Creating the node with following fields
	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	//adding node at first
	public void addFirst(int data) {
		Node newNode = new Node(data);

		newNode.next = head;
		newNode.prev = null;

		if (head != null)
			head.prev = newNode;

		head = newNode;
	}

	
	//adding node at Last
	void addLast(int data) {
		Node newNode = new Node(data);

		Node curr = head; 

		newNode.next = null;

		if (head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}

		while (curr.next != null)
			curr = curr.next;

		curr.next = newNode;

		newNode.prev = curr;
	}

	//Printing the list
	public void printlist(Node node)
	{
		Node curr = null;
		
		while (node != null) {
			System.out.print(node.data + " ");
			curr = node;
			node = node.next;
		}
		
	}
   
	//To delete the node
	void deleteNode(Node del)
    {
		if (head == del) {
            head = del.next;
        }
		
		 if (del.next != null) {
	            del.next.prev = del.prev;
	        }
	 
	        if (del.prev != null) {
	            del.prev.next = del.next;
	        }
	        
	        
		return;
    }
	
	//Access the node by index
	public int GetNodeByIndex(int index) 
    { 
        Node curr = head; 
        int count = 0; 
        while (curr != null) 
        { 
            if (count == index) 
                return curr.data; 
            count++; 
            curr = curr.next; 
        } 
  
        return 0; 
    } 
	
		
	public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.addLast(10);

		dll.addLast(20);
		
		dll.addLast(30);
		
		dll.addLast(40);
		
		
		dll.printlist(dll.head);
		
			
	}
}


