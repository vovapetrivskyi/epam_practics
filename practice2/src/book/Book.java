package book;

/**
 * Created by Volodymyr Petrivskyi on 09.11.2017.
 */
public class Book {
    private String title, author, publishing_house;
    private int year, pages;
    private float price;

    public Book(String title, String author, String publishing_house, int year, int pages, float price) {
        this.title = title;
        this.author = author;
        this.publishing_house = publishing_house;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return (String.format("%s, %s, %s, %s, %s pages, price: %s", title, author, publishing_house, year, pages, price));
    }
}
