package DataStructure.数据结构.数组;

public class OrderedArray {
    private int[] array;
    private int size;
    private int elementNumber;

    public OrderedArray(int[] array, int size, int elementNumber) {
        this.array = array;
        this.size = size;
        this.elementNumber = elementNumber;
    }

    public int getSize() {
        return this.elementNumber;
    }

    //二分查找法
    public int find(int searchNumber) {  //时间复杂度为 O(log(2)n)=O(logn)
        int small = 0;
        int large = elementNumber - 1;
        int current;
        while (true) {
            current = (small+large) / 2;
            if (array[current] == searchNumber) {
                return current;
            } else if (small > large){
                return -1;
            } else {
                if (array[current] < searchNumber) {
                    small = current + 1;
                } else {
                    large = current - 1;
                }
            }
        }
    }

    public boolean insert(int number) { //时间复杂度为O(n)
        if (elementNumber == size) {
            System.out.println("the size is enough");
            return false;
        }
        int j;
        for (j=0; j < elementNumber; j++) {
            if (array[j] > number)
                break;
        }
        for (int k = elementNumber; k > j; k--) {
            array[elementNumber] = array[elementNumber-1];  // 数组多一个元素，全部后移一位
        }
        array[j] = number;
        elementNumber++;
        return true;
    }

    public boolean delete(int number) {  //时间复杂度为O(n)
        int j = find(number);
        if (j == -1) {
            System.out.println("can not find");
            return false;
        }
        if (elementNumber == size) {
            for (int k = j; k<elementNumber-1; k++) {
                array[k] = array[k+1];
            }
        } else {
            for (int k = j; k<elementNumber; k++) {
                array[k] = array[k=1];
            }
        }
        elementNumber--;
        return true;
    }

    public void display() {
        for (int i = 0; i<elementNumber; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

}
