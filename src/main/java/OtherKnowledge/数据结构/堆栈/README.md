# Java中的集合
java中的堆栈
------
栈内存用来存储局部变量和方法调用。栈内存是线程私有的,主要用来执行程序用的。特点是先进后出,后进先出,存取速度比堆要快,栈中的数据大小和生存期是确定的。  
栈内存使用的例子:  
int a = 3;int b = 3;先创建变量a的引用,在栈中查找是否有3这个歌值,没有的话将3存储在栈中,对于b则是创建b的引用,在栈中找到3,直接赋值。  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/stack02.png)  
![image](https://github.com/Li2210/deignPatternStudy/blob/master/img/stack.png)  
堆内存用来存储Java中的对象,无论是成员变量,局部变量还是类变量,它们指向的对象都存储在堆内存中。堆是先进先出,后进后出。
堆内存是所有的线程共有的。栈的空间大小远远小于堆的,例如使用递归时栈内存很快会满,抛出StackOverFlowError。  
int[] array = new int[]{1,2};这时将对象{1,2}存储在堆内,引用存储在栈中。  