package OtherKnowledge.List.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.io.Serializable;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Serializable> v1 = new Vector<>();

        v1.add(1);
        v1.add(2);
        System.out.println("vector is: "+ v1);
        v1.add("abc");
        v1.add(1.25);
        System.out.println("new vector is: "+v1);
        System.out.println("vector's length is: "+v1.size());
        System.out.println("vector capacity is: "+v1.capacity());
        v1.add(4);
        v1.add("def");
        v1.add(12.5);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        System.out.println("vector's new size: "+v1.size());
        System.out.println("vector's new capacity: "+v1.capacity());

        /**
         * 枚举enumeration现在主要用迭代器
         */
        Enumeration vEnum = v1.elements();
        while (vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement()+" ");
        }
        System.out.println();
        System.out.println("iterator: ");
        Iterator iterator = v1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
