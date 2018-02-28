public class HofFunction {
    public static int do_twice(IntUniFunction f, int i){
        return f.apply(f.apply(i));
    }


    public static void main(String[] args) {
        int i = 2;
        IntUniFunction tenx = new TenX();
        System.out.println(do_twice(tenx,i));
    }
}

