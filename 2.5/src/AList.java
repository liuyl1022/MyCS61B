
/** 都是int类型的 数组 然后串起来成一个list
初始： [0, 0, 0, 0, 0, 0 ...]
	   size: 0
	index: 0,1,2,3,4,5,6...
 addlist: [4,7,9,3,1,0,0...]
 		  size: 5
*/



public class AList<item>{
	private int size = 0 ;
	private item[] items;

	public AList(){
		items =  (item[]) new Object[100];
		size = 0;
	}

	// AList prev;
	// int value;
	// AList next;
	// IntNode sentinel;

	// public class IntNode{
	// 	public int item;
	// 	public IntNode next;

	// 	public IntNode(int i, IntNode n){
	// 		this.item = i;
	// 		this. next = n;
	// 	}
	// }

/** 把resizing 拿出来做一个方法
*/


	public void resizing(int capacity){
		item[] new_items = (item[]) new Object[capacity];
		System.arraycopy(items, 0, new_items, 0, size);
		items = new_items;
		
	}

/** invariants: the next item we want to add, will go into position size. 
*/

	public void addLast(item i){
		if(size == items.length){
			resizing(size+1);
		}
		
		items[size] = i;
		size += 1;
		
	}

/** invariants: the last item to get is always the size-1.
*/
	public item getLast(){
		return items[size-1];
	}


	public item get(int i){
		return items[i];
	}


	public int size(){
		return size;
	}

	public item removeLast(){
		item i = getLast();
		items[size - 1] = null;
		size -= 1;
		return i;
	}

	public static void main(String[] args) {
		
	}
}