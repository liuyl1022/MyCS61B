public class Maximizer {
    public static Comparable max(Comparable[] items){
        int maxDex = 0;
        for(int i = 0; i< items.length;i++){
            int cmp = items[i].compareTo(items[maxDex]);
            if(cmp > 0){
                maxDex = i;
            }
        }

        return items[maxDex];
    }


    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3),
                      new Dog("Sture", 10),
                      new Dog("Artemesios",15)};

        Dog maxdog = (Dog) max(dogs);
        maxdog.bark();
    }
}
