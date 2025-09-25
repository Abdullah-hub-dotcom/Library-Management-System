public class Book{
    private int bookid;
    private String author;
    private String title;
    private boolean isIssued;

    public Book(int id, String author, String title) {
        this.bookid = id;
        this.author = author;
        this.title = title;
        this.isIssued = false;
    }

    public int getId() {
        return bookid;
    }

    public void setId(int id) {
        this.bookid = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookid +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }
}