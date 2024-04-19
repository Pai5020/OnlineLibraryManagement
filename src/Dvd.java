public class Dvd extends Library implements User{

    public Dvd(String name, int id){
        super(name, id);
    }


    @Override
    public void borrowItem() {
        System.out.println("The DVD is borrowed");
    }

    @Override
    public void returnItem() {
        System.out.println("the DVD is returned");

    }

    @Override
    public void addItem() {
        System.out.println("DVD has beend added");
    }

    @Override
    public void removeItem() {
        System.out.println("DVD removed");

    }
}
