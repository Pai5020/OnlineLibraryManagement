public class Dvd implements User{
    private String nameD;
    private int idD;

    public int getIdD() {
        return idD;
    }

    public String getNameD() {
        return nameD;
    }

    public void setIdD(int D) {
        idD = D;
    }

    public void setNameD(String nD) {
        nameD = nD;
    }

    @Override
    public void borrowItem() {
        System.out.println("The DVD is borrowed");
    }

    @Override
    public void returnItem() {
        System.out.println("the DVD is returned");

    }
}
