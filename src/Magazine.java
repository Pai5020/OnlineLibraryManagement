public class Magazine extends Library implements User{

   public Magazine(String name, int id){
       super(name, id);
   }

    @Override
    public void borrowItem() {
        System.out.println("The user has borrowed Magazine");
    }

    @Override
    public void returnItem() {
        System.out.println("The user has returned Magazine");

    }

    @Override
    public void addItem() {
        System.out.println("Magazine added");
    }

    @Override
    public void removeItem() {
        System.out.println("Magazine removed");
    }
}
