package DataStructure.数据结构.堆栈;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack is empty? "+stack.empty());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println("栈顶值是: "+stack.peek());
        //出栈
        stack.pop();
        System.out.println("新的栈顶值为: "+stack.peek());
    }
}
