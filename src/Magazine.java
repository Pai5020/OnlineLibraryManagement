public class Magazine implements User{
    private String name;
    private int id;

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public void setId(int i){
        id = i;
    }

    @Override
    public void borrowItem() {
        System.out.println("The user has borrowed Magazine");
    }

    @Override
    public void returnItem() {
        System.out.println("The user has returned Magazine");

    }
}
