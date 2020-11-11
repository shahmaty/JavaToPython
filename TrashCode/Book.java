package test;
//Comments are GAY
public class Book {
	
	private String ISBN;
    private String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public Book(Book other) {
        this(other.ISBN, other.title, other.author);
    }

    public Book(String title, String author) {
        this("", title, author);
    }

    public Book(String title) {
        this("", title, "");
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        if (!title.equals("")) {
            this.title = title;
        }
    }
    
    @Override
    public String toString() {
    	return title + " by " + author;
    }
}
