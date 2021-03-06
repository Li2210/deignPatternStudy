# Deign Pattern
design pattern by java
------
工厂父类负责定义创建产品的公共接口,而工厂子类则负责生成具体的产品对象,通过不同的工厂子类来创建不同的产品对象。  
优点:  
用户只需要关心所需产品对应的工厂,无须关心创建细节,甚至不需要知道具体产品类的类名。  
需要加入新产品时,不需要修改抽象工厂和抽象产品提供的接口,也不需要修改其他类,添加一个具体的工厂类和对应的产品类即可(开闭原则)。  
具体工厂可以自主确定创建产品对象和相关细节,所有具体工厂类都具有同一个抽象工厂父类,又被称为多态工厂。  
缺点：  
加入新产品时,要添加一个具体的工厂类和对应的产品类,增加了系统的复杂度。  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/factory-method.png)