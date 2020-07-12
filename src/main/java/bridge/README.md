# Deign Pattern
design pattern by java
------
将抽象部分与它的实现部分分离,使得每一个部分可以独立地变化。在多维度中比较有效可以参考inheritance,有效减少类的数量。  
如3维系统2*2*8一共要32个类,利用桥接模式每一个维度有一个接口和对应的实现类,数量变为3+3+9再加一个最后组装的类一共16。  
有效减少类的数量。  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/bridge-pattern.png)
