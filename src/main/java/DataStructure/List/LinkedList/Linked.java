package DataStructure.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        /**
         * add elements
         */
        list.add("a");
        list.add("b");
        list.add("c");

        /**
         * add elements at special position
         */
        list.addFirst("o");
        list.addLast("d");
        list.add(2,"z");

        System.out.println("linked list is: "+list);

        /**
         * 遍历
         */

        for (String n : list ){
            System.out.println(n);
        }
        System.out.println("===============");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=================");

        /**
         * clear
         */
        list.clear();
        System.out.println("empty?\n"+list.isEmpty());
    }
}
