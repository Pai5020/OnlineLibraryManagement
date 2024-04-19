public class Book extends Library implements User{

    private final String author;

    public Book(String name, String author, int id){
        super(name, id);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void borrowItem() {
        System.out.println("The user has borrowed the book");
    }

    @Override
    public void returnItem() {
        System.out.println("the Book is returned");

    }

    @Override
    public void addItem() {
        System.out.println("The item has been added");
    }

    @Override
    public void removeItem() {
        System.out.println("The item has been removed");

    }
}
