package lab3.visitor;

public class Book implements Element{
    private String book;
    private int numberOfPages;
    private float price;

    public Book(String book, int numberOfPages, float price) {
        this.book = book;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
