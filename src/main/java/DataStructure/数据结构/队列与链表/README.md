# java中的队列和链表
------
队列是一种数据结构是一种线性表不过也可以使用链表来实现,尾部添加,头部删除,先进先出。  
队列有两种形式,一种是单队列,一种是循环队列。  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/queue01.png)  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/queue02.png)  
可以用链表来实现队列,ArrayList是数组,LinkedList是链表采用双向循环链表。链表在进行循环遍历时效率低,但是
插入和删除优势明显。  
单向链表是一种线性表,由节点组成,一个链表的节点数量不确定。数据在内存中存储是不确定的,每个节点只能知道下一个
节点的存储位置。每一个Node记录本Node的数据及下一个Node。向外暴露的只有一个头节点，
我们对链表的所有操作，都是直接或者间接地通过其头节点来进行的。 
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/link01.png)  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/link02.png)  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/link03.png)
