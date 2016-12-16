
public class Node {
	Node previouse;
	String data;
	Node next;

	Node(Node h, String data, Node last) {
		this.previouse = h;
		this.data = data;
		this.next = last;

	}

	public Node(String data) {
		previouse = null;
		this.data = data;
		next = null;

	}

	public String toString() {
		return data;
	}

}
