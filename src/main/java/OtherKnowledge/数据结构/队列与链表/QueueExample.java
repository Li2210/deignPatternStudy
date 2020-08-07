package OtherKnowledge.数据结构.队列与链表;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //queue继承collection接口,java中队列的实现就是用LinkedList
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
        for (String q : queue){
            System.out.print(q+" ");
        }
        System.out.println("==============");
        System.out.println("the first element is: "+queue.peek());
        System.out.println("return and remove the first element: "+queue.poll());
        System.out.println("the first element is: "+queue.peek());
    }
}
