package Collection_PAckage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Methods {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("ganesha");
        obj.add("mahadev");
        obj.add("vishnu");
        obj.add("indra");

        obj.add(3, "ram");

        List ob = new ArrayList();

        ob.add(100);
        ob.add(101);
        ob.add("vinayak");
        ob.add("gajadyksha");
        ob.add("lambodar");
        ob.add("ekdanta");
        ob.add("gajanan");
        ob.add("varad");
        ob.add("ganapati");

//        System.out.println(obj.get(0));
//        obj.clear();
//        System.out.println(obj);
//
//        System.out.println(obj.hashCode());
//
//        System.out.println(obj.isEmpty());
//
//        System.out.println(obj.remove(0));

//        System.out.println(obj.get(6));

//        System.out.println(obj.retainAll(ob));

//        System.out.println(obj.remove(1));
//        System.out.println(obj);

//   Collection class Methods
        System.out.println(ob.size());
        System.out.println(ob.isEmpty());
        System.out.println(ob.contains("Vinayak"));
        System.out.println(ob.remove(0));


     /*  Iterator <String> ref = obj.iterator();
     while(ref.hasNext()){
      System.out.println("print element "+ref);
     }*/

    /* for (Object s : obj){
      System.out.println(s);
     }*/

    /*
     for (int i = 0; i < ob.size(); i++) {
            System.out.println(ob.get(i));
        }*/


    }
}
