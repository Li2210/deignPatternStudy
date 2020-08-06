package OtherKnowledge.Map.HashMap;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        //key—value 键值对
        Map<Integer, String> example = new HashMap<>();

        example.put(0, "Tom");
        example.put(1, "Jerry");
        example.put(2, "Alice");
        example.put(3, "John");
        example.put(4, "Amy");

        System.out.println(example.size());
        //判断是否包含键或值
        System.out.println(example.containsKey(1));
        System.out.println(example.containsValue("Tom"));
        //通过key获得值value
        Object o = example.get(2);
        System.out.println(o);
        //通过key删除键值对
        example.remove(1);
        System.out.println("===============");
        System.out.println(example.containsValue("Jerry"));
        System.out.println(example.containsKey(1));
        System.out.println(example.size());
        //遍历所有的值
        System.out.println("===============");
        Collection values = example.values();
        Iterator it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //通过key来遍历
        Set keys = example.keySet();
        Iterator it2 = keys.iterator();
        while (it2.hasNext()){
            Object key = it2.next();
            Object name = example.get(key);
            System.out.println(key+"--->"+name);
        }
    }
}
