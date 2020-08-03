package OtherKnowledge.Set.TreeSet;

public class BinaryTree {
    private Node root;

    /**
     * 内部节点类
     */
    private class Node{
        private Node left;
        private Node right;
        private int data;
        private boolean isDelete;
        public Node(int data){
            this.data = data;
            this.isDelete = false;
        }
    }

    public BinaryTree(){
        root = null;
    }

    public void delete(int value){
        Node current = root;
        if (find(value) == null){
            System.out.println("Do not have this value");
        }
        while (find(value) != null){
            if (current.data > value) { // 在左子树
                current = current.left;
            } else if (current.data < value){
                current = current.right;
            } else {
                current.isDelete = true;
            }

        }
    }

    /**
     * 递归创建二叉树
     */
    public void buildTree(Node node, int data){
        if(root == null){
            root = new Node(data);
        }else{
            if(data < node.data){
                if(node.left == null){
                    node.left = new Node(data);
                }else{
                    buildTree(node.left, data); //不为空继续调用buildTree,以node.left代替原node
                }
            }else{
                if(node.right == null){
                    node.right = new Node(data);
                }else{
                    buildTree(node.right, data);
                }
            }
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder(Node node){
        if(node != null && node.isDelete != true){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder(Node node){
        if(node != null && node.isDelete != true){
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(Node node){
        if(node != null && node.isDelete != true){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    /**
     * 查找节点
     */
    public Node find(int key){
        Node current = root;
        while (current != null){
            if (current.data > key){ //查找值比当前值要小时,搜索左子树
                current = current.left;
            } else if (current.data < key){ //查找值比当前值要大时,搜索右子树
                current = current.right;
            } else { //查找值等于当前值时
                if (!current.isDelete){
                    return current;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * 插入节点
     */
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){ //当前树为空树
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null){ // current == null 插入值了, 不再满足
                parentNode = current;
                if (current.data > value) { //插入值大
                    current = current.left;
                    if (current == null){ //只有当current==null的时候才可以进行插入
                        parentNode.left = newNode;
                        return true;
                    }
                } else {
                    current = current.right;
                    if (current == null){
                        parentNode.right = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 删除
     */


    public static void main(String[] args) {
        int[] a = {12, 11, 19, 37, 48, 8, 56, 23};
        BinaryTree bTree = new BinaryTree();
        for (int i = 0; i < a.length; i++) {
            bTree.buildTree(bTree.root, a[i]);
        }
        System.out.print("前序: ");
        bTree.preOrder(bTree.root);
        System.out.println();
        System.out.print("中序: ");
        bTree.inOrder(bTree.root);
        System.out.println();
        System.out.print("后序: ");
        bTree.postOrder(bTree.root);
        System.out.println();
        //插入值测试
        bTree.insert(5);
        System.out.print("前序: ");
        bTree.preOrder(bTree.root);
        System.out.println();
        //删除测试
        System.out.println("有这个值吗:"+bTree.find(5));
        bTree.delete(5);
        System.out.println("有这个值吗:"+bTree.find(5));
        System.out.print("前序: ");
        bTree.preOrder(bTree.root);
    }
}
