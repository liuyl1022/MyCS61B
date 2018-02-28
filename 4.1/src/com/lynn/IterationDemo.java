package com.lynn;

public class IterationDemo {

    public static void main(String[] args) {
        ArrayMap<String,Integer> am = new ArrayMap<>();

        am.put("apple",1);
        am.put("banana",2);
        am.put("cup",3);

//        ArrayMap.KeyIterator ami = am.new KeyIterator();
//
//        while(ami.hasNext() != false){
//            System.out.println(ami.next());
//        }

        for(String s: am){
            System.out.println(s);
        }



    }

}
