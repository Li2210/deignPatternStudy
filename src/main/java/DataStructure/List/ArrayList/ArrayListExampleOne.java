package DataStructure.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampleOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Initial version:"+list);
        System.out.printf("Initial size:%d\n", list.size());

        /**
         * 增加新的元素
         */
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("after add new numbers:"+list);
        System.out.printf("Second size:%d\n", list.size());

        /**
         * 遍历ArrayList
         */
        //for循环
        System.out.println("for loop 1.0:");
        for (int i : list){
            System.out.println(i);
        }
        System.out.println("for loop 2.0:");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //利用迭代器遍历
        System.out.println("iterator:");
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        /**
         * 指定位置的操作
         */
        //在第2位上加入2
        list.add(1,2);
        System.out.println("after add new numbers:"+list);
        System.out.printf("Third size:%d\n", list.size());
        //将第2位上的2转换为100
        list.set(1,100);
        System.out.println("after set new numbers:"+list);
        System.out.printf("Fourth size:%d\n", list.size());
        //删除第2位上的数字2
        list.remove(1);
        System.out.println("after remove new numbers:"+list);
        System.out.printf("Fifth size:%d\n", list.size());
        //删除数字5
        list.remove((Object)5);
        System.out.println("after remove new numbers:"+list);
        System.out.printf("Sixth size:%d\n", list.size());

        /**
         * clear
         */
        //判断是否含有数字7
        System.out.println("if 7 is in the list: "+list.contains(7));
        list.clear();
        System.out.println("if list is empty: "+list.isEmpty());
    }
}
