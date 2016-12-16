package LinkedListInpractice;

public class DoublyLinkedList {

	Link header;
	int size;

	public DoublyLinkedList() {
		header = null;
		size = 0;
	}

	public void addFront(int data) {
		if (header == null)
			header = new Link(null, data, null);
		else {
			Link newLink = new Link(null, data, header);
			header.prev = newLink;
			header = newLink;
		}
		size++;
	}

	public void addLast(int data) {
		if (header == null)
			header = new Link(null, data, null);
		else {
			Link curentLink = header;
			while (curentLink.next != null) {
				curentLink = curentLink.next;
			}
			Link newLink = new Link(curentLink, data, null);
			curentLink.next = newLink;

		}
		size++;
	}

	public void addFrontAgain(int data) {
		if (header == null)
			header = new Link(null, data, null);
		else {
			Link newLink = new Link(null, data, header);
			header.prev = newLink;
			header = newLink;
		}
	}
	public void addLastAgain(int data) {
		if (header == null)
			header = new Link(null, data, null);
		else {
			Link curent=header;
			while(curent.next !=null){
				curent=curent.next;
			}
			Link newLink= new Link(curent,data,null);
			curent.next=newLink;
		}
	}

	public void display() {
		Link n = header;
		while (n != null) {
			System.out.println(n.data());
			n = n.next;
		}

	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFrontAgain(10);
		dll.addFrontAgain(20);
		dll.addFrontAgain(30);
		dll.addLastAgain(40);
		dll.display();
		

	}

}
