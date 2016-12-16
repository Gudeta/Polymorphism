package LinkedListInpractice;

public class Link {
	Link prev;
	int data;
	Link next;

	Link(Link p, int data, Link next) {
		this.prev = p;
		this.data = data;
		this.next = next;
	}

	Link(int data) {
		prev = null;
		this.data = data;
		next = null;
	}

	public int data() {
		return data;

	}

}
