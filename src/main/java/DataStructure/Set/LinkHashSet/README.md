# Java中的集合
LinkedHashSet in java
------
对于LinkedHashSet而言，它继承与HashSet、又基于LinkedHashMap 来实现的。LinkedHashSet底层使用
LinkedHashMap来保存所有元素，它继承与HashSet，其所有的方法操作上又与HashSet相同，因此LinkedHashSet
的实现上非常简单，只提供了四个构造方法，并通过传递一个标识参数，调用父类的构造器，底层构造一个LinkedHashMap来实现，在相关操
作上与父类HashSet的操作相同，直接调用父类HashSet的方法即可。