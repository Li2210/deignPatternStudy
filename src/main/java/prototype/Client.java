package prototype;

public class Client {

    public static void main(String[] args) {
        //book one
        Book book1 = new Book();
        book1.setTitle("peace and war");
        book1.setAuthor("person A");
        book1.addChapter("start");
        book1.printBook();

        //拷贝
        Book book2 = (Book) book1.clone();
        book2.printBook();
        //change
        book2.setAuthor("person B");
        book2.addChapter("good time");
        book2.printBook();
        //观察book1 浅拷贝对book1的修改也影响到了book2
        /*引用类型的新对象book2的chapter只是单纯指向了this.chapter引用，
         并没有重新构造一个chapter对象，然后将原始书本的章节添加到新的chapter对象中，
         这样导致book2中的chapter与原始书本中的是同一个对象.
         */
        book1.printBook();
    }
}
