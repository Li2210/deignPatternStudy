package DataStructure.Set.TreeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Double> scores = new TreeSet<Double>();

        Scanner input = new Scanner(System.in);
        System.out.println("----------学生成绩管理系统--------");
        for (int i = 0; i < 5; i++){
            System.out.println("第"+(i+1)+"个学生成绩: ");
            double score = input.nextDouble();
            scores.add(score);
        }
        Iterator<Double> it = scores.iterator();
        /**
         * TreeSet自动排序的
         */
        System.out.println("学生成绩从低到高排序为:");
        while (it.hasNext()) {
            System.out.println(it.next() + "\n");
        }

    }

}
