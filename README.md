# Deign Pattern
design pattern by java
------
HashMap的相关知识(红黑树)需要继续补充,多线程以及一些基本算法  
  
设计原则：  
高内聚(high cohesion, intra-object relationship),低耦合(low coupling, inter-objects relationship)  
Assign responsibilities to make sure the cohesion remains high(类中的每个成员方法尽量只负责一件事).  
Low coupling: low dependency, increase reuse, reduce the impact of change.  
1.Single responsibility principle(单一职责)  
一个类，有且只有一个引起它变化的原因。一个类不要承担过多的职责。  
2.Open closed principle(开闭)  
一个软件实体对扩展开放，对修改关闭。对软件实体的变化应该通过扩展来实现而不是修改。  
3.Liskov substitution principle(里氏替换)  
所有引用父类的地方必须能使用子类进行替换。(使用子类的地方不能用父类来替换)  
4.Dependency inversion principle(依赖倒置)  
高层模块不要依赖底层模块，两者都要依赖于抽象。抽象不应该依赖于细节，细节应该依赖于抽象。  
抽象:interface/abstract class 细节:implement class  
implement classes之间不发生直接依赖关系, 依赖关系通过interface/abstract class产生  
5.Interface segregation principle(接口隔离原则)  
一个类对另一类的依赖应该建立在最小的接口上,客户端不应该依赖它不需要的接口。  
接口要细化单一,不要庞大臃肿的接口。接口中的方法要尽量少,为各个类建立专用的接口,不要用一个很庞大的接口供所有依赖它的类调用。  
6.Law of Demeter(迪米特法则)  
一个软件实体应当尽可能少的与其他实体发生相互作用。  
一个对象的某一个方法需要调用另一个对象的方法时，可以通过第三者实现调用。调用者对被调用者内部的情况知道的越少越好。  
应该尽量避免getA().getB().getC()这样的链式调用。  
