# Java中的集合
HashSet in java
------
哈希表存放的是哈希值。存储元素的顺序并不是按照存入时的顺序,而是按照哈希值来存的所以数据也是
按照哈希值来取得。元素的哈希值是通过元素的hashcode方法来获取的,HashSet首先判断两个元素的
哈希值,如果哈希值一样,接着会比较equals方法。如果equals结果为true，HashSet就视为同一个元素。
如果equals为false就不是同一个元素。