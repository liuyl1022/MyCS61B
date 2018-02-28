public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void insert (int item, int position){
        if( position == 0){
            addFirst(item);
            return;
        }else{
            IntNode currentNode = first;
            while(position > 1 && currentNode.next != null ){
                position--;
                currentNode = currentNode.next;
            }


            IntNode newNode = new IntNode(item, currentNode.next);
            currentNode.next = newNode;
        }
    }

    public IntNode reversehelper(IntNode front){
        if(front == null && front.next == null){
            return front;
        }else{
           IntNode reversed = reversehelper(front.next);
           front.next.next = front;
           front.next = null;
           return reversed;
        }

    }

    public void reverse(){
        first = reversehelper(first);
    }


    public void reverse2() {
        IntNode frontOfReversed = null;
        IntNode nextNodeToAdd = first;

        while(nextNodeToAdd != null){
            IntNode remainderOfOriginal = nextNodeToAdd.next;
            nextNodeToAdd.next = frontOfReversed;
            frontOfReversed = nextNodeToAdd;
            nextNodeToAdd = remainderOfOriginal;
        }

        first = frontOfReversed;


    }



    public static void main(String[] args) {
            SLList S = new SLList();
            S.addFirst(2);
            S.addFirst(0);
            S.insert(1,1);
            System.out.println(S.first.next.item);
            S.reverse2();
    }


    public static int[] insert(int[] x, int item, int position){
        int[] newX = new int[x.length + 1];
        position = Math.min(x.length,position);

        for(int i = 0; i < position; i++){
            newX[i] = x[i];
        }

        newX[position] = item;

        for(int indexInOld = position; indexInOld < x.length; indexInOld++){
            newX[indexInOld + 1] = x[indexInOld];
        }
        return newX;
    }


}
