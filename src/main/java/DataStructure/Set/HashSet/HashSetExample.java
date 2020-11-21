package DataStructure.Set.HashSet;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        /**
         * 无序且值唯一
         */
        set.add("Jerry");
        set.add("Tom");
        set.add("Alice");
        System.out.println("can we add Tom again? "+set.add("Tom"));
        System.out.println("HashSet: "+set);

        /**
         * 运用清除ArrayList中的重复值
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println("list is: "+list);
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(list);
        System.out.println("set1 is:"+set1);
        list.clear();
        list.addAll(set1);
        System.out.println("new list is: "+list);

        /**
         * 遍历set中无get方法用for或迭代器遍历
         */
        System.out.println("the first value of the list is: "+list.get(0));
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            System.out.println();
        }

        /**
         * test: 创建一个长度是100的字符串数组
         * 使用长度是2的随机字符填充该字符串数组
         * 统计这个字符串数组里重复的字符串有多少种
         * 使用HashSet来解决这个问题
         */
        ArrayList<String> l = new ArrayList<>();
        //随机字符串
        String database = "0123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
        Random random = new Random();
        //每两个字符放在一起
        for (int i=0; i<100; i++){
            char s1 = database.charAt(random.nextInt(database.length()));
            char s2 = database.charAt(random.nextInt(database.length()));
            String newStr = ""+s1+s2;
            l.add(newStr);
        }

        HashSet<String> h = new HashSet<>();
        h.addAll(l);
        l.clear();
        l.addAll(h);
        System.out.println("重复的个数为: "+(100-l.size()));
    }


}
