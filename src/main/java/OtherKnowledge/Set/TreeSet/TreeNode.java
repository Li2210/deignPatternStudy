package OtherKnowledge.Set.TreeSet;


import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    private TreeNode leftTreeNode;

    private TreeNode rightTreeNode;

    private Object value;

    public void add(Object v){

        if (null == value){
            value = v;
        } else {

            //新增加的值比原值要小
            if ((Integer)v - ((Integer)value) <= 0){
                if (null == leftTreeNode){
                    leftTreeNode = new TreeNode();
                }
                leftTreeNode.add(v); ////不为空继续调用add,以leftTreeNode代替原node
            } else {
            //新增加的值比原值要大
                 if (null == rightTreeNode){
                     rightTreeNode = new TreeNode();
                 }
                 rightTreeNode.add(v);
            }
        }
    }

    //中序遍历(从小到大)
    public List<Object> zhong(){
        List<Object> values = new ArrayList<>();

        //左序节点的遍历结果
        if (null != leftTreeNode)
            values.addAll(leftTreeNode.zhong());

        //当前节点(根)
        values.add(value);

        //右节点的遍历结果
        if (null != rightTreeNode)
            values.addAll(rightTreeNode.zhong());

        return values;
    }

    //前序遍历
    public List<Object> qian(){
        List<Object> values = new ArrayList<>();

        //根
        values.add(value);

        //左序节点
        if (null != leftTreeNode)
            values.addAll(leftTreeNode.qian());

        if (null != rightTreeNode)
            values.addAll(rightTreeNode.qian());

        return values;
    }

    //后序遍历
    public List<Object> hou(){
        List<Object> values = new ArrayList<>();

        //left
        if (null != leftTreeNode)
            values.addAll(leftTreeNode.hou());

        //right
        if (null != rightTreeNode)
            values.addAll(rightTreeNode.hou());

        values.add(value);

        return values;
    }

    public static void main(String[] args) {
        int [] arrays = {12, 11, 19, 37, 48, 8, 56, 23, 89};
        TreeNode tree = new TreeNode();
        for (int number : arrays){
            tree.add(number);
        }
        System.out.println("中序遍历树得出的结果为:" + tree.zhong());
        System.out.println("前序遍历树得出的结果为:" + tree.qian());
        System.out.println("后序遍历树得出的结果为:" + tree.hou());
    }
}
