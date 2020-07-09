package prototype;

import java.util.ArrayList;

public class Book implements Cloneable {

    private String title;
    private String author;
    private ArrayList<String> chapter = new ArrayList<String>();

    public Book(){
        super();
    }

    /**
     * 重写clone
     */
    @Override
    protected Object clone() {
        try {
            Book book = (Book) super.clone();
            //实现深拷贝
            book.chapter = (ArrayList<String>) this.chapter.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public ArrayList<String> getChapter(){
        return  chapter;
    }

    public void addChapter(String chapter){
        this.chapter.add(chapter);
    }

    public void printBook(){

        System.out.println("==============================");
        System.out.println("this book's title is: "+title);
        System.out.println("this book's author is: "+author);
        for (String chapter : chapter){
            System.out.println("chapter is: "+chapter);
        }
        System.out.println("==============================");

    }
}
