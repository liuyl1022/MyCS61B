public class IntList{

	public int first;
	public IntList rest;


	public IntList(int f, IntList r){
		first = f;
		rest = r;
	}

	public int sizeOfIntList(){
		int i = 0;
		IntList p = this;   //!!!!!
		while(p != null){
			i ++ ;
			p = p.rest;
		}

		return i;	
	}

	public int recursionSize(){
		if(this.rest == null){
			return 1;
		}else{
			return 1 + this.rest.recursionSize();
			
		}
	}

	public int get(int i){
		
		if(i == 0){
			return first;
		}else{
			return rest.get(i-1);
		}

	}

	public static void main(String[] args) {
		// IntList L = new IntList();
		// L.first = 4;
		// L.rest = null;

		// L.rest = new IntList();
		// L.rest.first = 10;
		// L.rest.rest = new IntList();
		// L.rest.rest.first = 15;
		IntList L = new IntList(15,null);

		L = new IntList(10 ,L);
		L = new IntList(4,L);

		System.out.println(L.sizeOfIntList());
		System.out.println(L.recursionSize());

		System.out.println(L.get(2));
	}
}