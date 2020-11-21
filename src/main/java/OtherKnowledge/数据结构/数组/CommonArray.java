package OtherKnowledge.数据结构.数组;

public class CommonArray {

    private int[] array;
    private int size;
    private int elementNumber;  //数组中的元素个数

    public CommonArray(int[] array, int size, int elementNumber) {
        this.array = array;
        this.size = size;
        this.elementNumber = elementNumber;
    }

    public boolean find(int searchNumber){
        int j;
        for (j=0; j < elementNumber; j++ ) {    //理论上循环n次 所以时间复杂度为O(n)
            if (array[j] == searchNumber) {
                System.out.println("find the number: "+ array[j]);
                break;
            }
        }
        if (j == elementNumber)
            return false;
        else
            return true;
    }

    public boolean insert (int number) {  //时间复杂度为O(1)
        if (elementNumber == size) {
            System.out.println("the size is enough");
            return false;
        }
        array[elementNumber] = number;
        elementNumber++;
        return true;
    }

    public boolean delete (int number) {  //时间复杂度为O(n)
        int j;
        for ( j=0; j<elementNumber; j++) {
            if (array[j] == number) {
                break;
            }
        }
        if (j == elementNumber) {
            System.out.println("can not find the number");
            return false;
        }
        if (elementNumber == size) {
            for (int k = j; k<elementNumber-1; k++) {
                array[k] = array[k+1];
            }
        } else {
            for (int k = j; k<elementNumber; k++) {
                array[k] = array[k+1];
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
