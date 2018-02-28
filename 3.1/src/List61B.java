public interface List61B<Item> {

    public void addFirst(Item x);

    public int size();

    public Item get(int i);

    default public void print(){
        for(int i = 0; i < size(); i++){
            System.out.println(get(i) + " ");
        }
    }
}
