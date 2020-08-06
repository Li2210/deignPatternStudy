# Java中的集合
HashMap in java
------
Map是Key-Value对映射的抽象接口，该映射不包括重复的键，即一个键对应一个值。
HashMap是Java Collection Framework的重要成员，也是Map族(如下图所示)中我们最为常用的一种。
简单地说，HashMap 是基于哈希表的Map接口的实现，以Key-Value的形式存在，即存储的对象是Entry(同时包含了Key和Value)。
在HashMap中，其会根据hash算法来计算key-value的存储位置并进行快速存取。特别地，HashMap最多只允许一条Entry的键为Null(多条会覆盖)，但允许多条Entry的值为Null。
此外，HashMap是Map的一个非同步的实现,即任一时刻可以有多个程序去写HashMap，线程不安全。  

