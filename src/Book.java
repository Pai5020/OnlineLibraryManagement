public class Book implements User{
    private final String name;
    private final String author;
    private final int id;

    public Book(String name, String author, int id){
        this.name = name;
        this.author = author;
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getId(){
        return id;
    }
    @Override
    public void borrowItem() {
        System.out.println("The user has borrowed the book");
    }

    @Override
    public void returnItem() {
        System.out.println("the Book is returned");

    }
}
