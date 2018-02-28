public class SLList<Blorp> implements List61B<Blorp> {


    public class Node {
        public Blorp item;     /* Equivalent of first */
        public Node next; /* Equivalent of rest */

        public Node(Blorp i, Node h) {
            item = i;
            next = h;
        }
    }

    private Node sentinel;
    private int size;

    /** Creates an empty list. */
    public SLList() {
        size = 0;
        sentinel = new Node(null, null);
    }
    public void addFirst(Blorp x) {
        Node oldFrontNode = sentinel.next;
        Node newNode = new Node(x, oldFrontNode);
        sentinel.next = newNode;
        size += 1;
    }

    public int size() {
        return size;
    }

    public Blorp get(int position) {
        if (position == 0) {
            return getFirst();
        }
        Node currentNode = sentinel.next.next;
        while (position > 1 && currentNode.next != null) {
            position -= 1;
            currentNode = currentNode.next;
        }

        return currentNode.item;
    }


    public Blorp getFirst() {
        return sentinel.next.item;
    }

}