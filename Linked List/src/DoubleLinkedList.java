
public class DoubleLinkedList {

	private Node header;
	int size;
	
	public DoubleLinkedList() {
		header=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return header==null;
	}
	public void addFront(String data){
		if(header==null)
			 header=new Node(null,data,null);
		else{
			Node newNode= new Node(null,data,header);
			newNode.next=header;
			header=newNode;
			
		}
		size++;
		
	}
	public int getSize(){
		return size;
	}
	public void print(){
		Node n=header;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
	DoubleLinkedList dl= new DoubleLinkedList();
	dl.addFront("Segni");
	dl.addFront("Temesgen");
	dl.addFront("Lecho");
	dl.print();

	}

}
