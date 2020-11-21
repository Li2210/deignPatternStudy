# Java中的集合
TreeSet in java
------
使用二叉树的原理对新增加的对象按照指定的顺序排序(升序,降序),每增加一个对象都会进行排序,将对象插入的二叉树指定的位置。  
Integer和String对象都可以进行默认的TreeSet排序,而自定义类的对象是不可以的,自己定义的类必须实现Comparable接口,
并且覆写相应的compareTo()函数,才可以正常使用。  
在覆写compare()函数时，要返回相应的值才能使 TreeSet 按照一定的规则来排序  
比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。  
学习link: https://zhuanlan.zhihu.com/p/37470148  
二叉树原理:  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/binarytree.png)
