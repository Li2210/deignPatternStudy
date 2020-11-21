# Deign Pattern
design pattern by java
------
The intent of the Builder pattern is to separate the construction of a complex object from its representation. By doing 
so the same construction process can create different representations.  
隐藏创建object的建造过程和细节,使得用户在不知道这些的情况下,可以直接创建复杂的对象。  
优点:  
降低了创建复杂对象的复杂度。代码复用性高。  
当一个类的构造参数个数超过4个,而且这些参数有些是可选的参数,可以考虑使用。  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/builder-pattern.png)