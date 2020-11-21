package DataStructure.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithPerson {
    public static void main(String[] args) {
        Person jerry = new Person("jerry", 18, 175);
        Person tom = new Person("Tom", 15, 170);
        Person alice = new Person("Alice", 20, 168);
        Person marry = new Person("Marry", 22, 165);
        Person abbey = new Person("Abbey", 25, 180);

        List<Person> list = new ArrayList<Person>();
        System.out.println("Initial version:"+list);
        System.out.printf("Initial size:%d\n", list.size());

        /**
         * add
         */
        list.add(jerry);
        list.add(tom);
        list.add(alice);
        list.add(marry);
        list.add(abbey);
        System.out.println("Second version:"+list);
        System.out.printf("Second size:%d\n", list.size());


        /**
         * 遍历
         */
        for (Person person : list){
            System.out.println("person name is: "+person.getName()+" person age is: "+person.getAge()+" person height is: "+person.getHeight());
        }


    }
}
