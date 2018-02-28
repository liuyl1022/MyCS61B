public class SLList{
	private int size;
	private IntNode sentinel;


	public SLList(int x){
		
		sentinel = new IntNode(0,null);
		sentinel.next = new IntNode(x,null);
		size = 1;
	}


	public SLList(){
		sentinel = new IntNode(0,null);
		size = 0; 
	}


	public void addFirst(int i){
		sentinel.next = new IntNode(i, sentinel.next);
		size += 1;
	}

	public int getFirst(){
		return sentinel.next.item;
	}

	public void addLast(int i){

		IntNode p = sentinel;
		while(p.next != null){
			p = p.next;
		}

		p.next = new IntNode(i,null);
		size += 1;
	}

	// private static int size(IntNode p){
	// 	if(p.next == null){
	// 		return 1;
	// 	}else{
	// 		return 1 + size(p.next);
	// 	}
	// }

	public int size(){
		return size;
	}

	public static void main(String[] args) {
		SLList L = new SLList(10);
		L.addFirst(5);
		L.addFirst(1);
		System.out.println(L.getFirst());

		L.addLast(15);
		L.addLast(20);

		L.size();

		System.out.println(L.size());
	}


}