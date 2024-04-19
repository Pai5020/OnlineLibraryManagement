public abstract class Library {
    String name;
    int id;
    public Library(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract void addItem();
    public abstract void removeItem();
}
